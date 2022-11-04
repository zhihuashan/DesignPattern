package com.designMode.CommandMode;
// 命令行模式
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn  = new LightOnCommand(light);
        remoteControl.setSlot(lightOn);
        remoteControl.buttonWasPressed();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand();
        remoteControl.setSlot(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
