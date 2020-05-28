package com.duan.design.singleton;

/**
 * 懒加载单例-线程不安全
 * 在获取本对象时，如果本对象没有初始化，则初始化
 *
 * @author duanjw
 */
public class Singleton {

    private static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance() {
        if(null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
