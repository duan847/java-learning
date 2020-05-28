package com.duan.design.command;

public class RemoteControlTest {
    public static void main(String[] args) {

        //遥控器
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        //灯
        Command command = new LightOnCommand(new Light());
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();



        //车库门
        command = new GarageDoorOpenCommand((new GarageDoor()));
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
    }
}
