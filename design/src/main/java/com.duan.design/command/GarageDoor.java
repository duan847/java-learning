package com.duan.design.command;

/**
 * 车库门
 * @author duanjw
 */
public class GarageDoor {
    /**
     * 升起车库门
     */
    public void up(){
        System.out.println("升起车库门");
    }
    /**
     * 降落车库门
     */
    public void down(){
        System.out.println("降落车库门");
    }
    /**
     * 停止车库门
     */
    public void stop(){
        System.out.println("停止车库门");
    }
    /**
     * 打车车库门的灯
     */
    public void lightOn(){
        System.out.println("打车车库门的灯");
    }
    /**
     * 关闭车库门的灯
     */
    public void lightOff(){
        System.out.println("关闭车库门的灯");
    }
}
