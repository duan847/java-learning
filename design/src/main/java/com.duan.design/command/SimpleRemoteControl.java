package com.duan.design.command;

/**
 * 遥控器
 * @author duanjw
 */
public class SimpleRemoteControl {

    Command solt;

    public void setCommand (Command command) {
        solt = command;
    }

    /**
     * 按下按钮调用
     */
    public void buttonWasPressed(){
        solt.execute();
    }
}
