package com.duan.design.proxy.head.remote.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author duanjw
 */
public class MyRemoteServer extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteServer() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, Hey";
    }

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteServer();
            Naming.rebind("RemoteHello", myRemote);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
