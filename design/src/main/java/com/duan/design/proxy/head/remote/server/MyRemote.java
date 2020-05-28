package com.duan.design.proxy.head.remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    /**
     * 打招呼
     * @return
     * @throws RemoteException
     */
    String sayHello() throws RemoteException;
}
