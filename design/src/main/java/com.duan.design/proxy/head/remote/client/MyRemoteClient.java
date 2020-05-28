package com.duan.design.proxy.head.remote.client;



import java.net.MalformedURLException;
import java.rmi.*;

/**
 * @author duanjw
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();

    }
    public void go(){
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://192.168.1.108/RemoteHello");
            String msg = myRemote.sayHello();
            System.out.println("recote:" + msg);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
