package com.designMode.CommandMode;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){

    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
    // 当按下按钮时，会自动去执行命令。
    public void buttonWasPressed(){
        slot.execute();
    }
}
