package com.duan.design.singleton;

/**
 * 饿加载单例-线程安全，可能会有资源浪费
 * 启动程序时，直接初始化本对象，如果对象一直没有使用，会造成资源浪费
 *
 * @author duanjw
 */
public class Singleton3 {

    private static Singleton3 sigleton = new Singleton3();
    private Singleton3(){}

    public static Singleton3 getInstance() {
        return sigleton;
    }

}
