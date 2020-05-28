package com.duan.design.singleton;

/**
 * 懒加载单例-线程安全，性能不好
 * 在获取本对象时，如果本对象没有初始化，则初始化，使用了同步锁，保证线程安全。同时由于使用同步锁，对性能不友好
 *
 * @author duanjw
 */
public class Singleton2 {

    private static Singleton2 sigleton;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance() {
        if(null == sigleton) {
            sigleton = new Singleton2();
        }
        return sigleton;
    }

}
