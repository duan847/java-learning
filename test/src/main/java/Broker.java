import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Broker implements Runnable {
    private Queue<Msg> queue = new ArrayBlockingQueue<Msg>(1000);
    private boolean status = true;


    public Boolean produce(Object o, long time) {
        final Msg msg = new Msg(o, time);
        return queue.offer(msg);
    }

    public Boolean confirm(Object o) {
        if (queue.element().o != o) {
            throw new IllegalStateException("此消息不是最早放入队列的消息");
        }
        status = true;
        return true;

    }
@Override
    public void run() {
        while (true) {
            if (status) {
                final Msg peek = queue.peek();
                if (peek != null && peek.time > 0) {
                    try {
                        Thread.sleep(peek.time);
                        // 消息传递给消费者
                        System.out.println("传递给消费者");
                        status = false;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }


    class Msg {
        private Object o;
        private long time;

        public Msg(Object o, long time) {
            this.o = o;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Broker broker = new Broker();
        new Thread(broker).start();
        broker.produce("a",1000);
        broker.produce("b",1000);

        broker.confirm("a");
    }
}
