package com.duan.design.singleton;

/**
 * 懒加载单例-线程安全，双重锁，不影响性能
 * @author duanjw
 */
public class Singleton4 {

    private volatile static Singleton4 sigleton;
    private Singleton4(){}

    public static Singleton4 getInstance() {
        //检查是否为null，如果是null才创建
        if(null == sigleton) {
            //同步块
            synchronized (Singleton4.class) {
                //进入同步块后，再次检查是否为null，如果是null才创建
                if(null == sigleton) {
                    sigleton = new Singleton4();
                }
            }
        }
        return sigleton;
    }

}
