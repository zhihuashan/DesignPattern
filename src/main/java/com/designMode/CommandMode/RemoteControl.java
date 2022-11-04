package com.designMode.CommandMode;
// 遥控器
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

//        Command noCommand = new NoCommand();
//        for(int i=0;i<7;i++){
//            onCommands[i] = noCommand;
//            offCommands[i] = noCommand;
//        }
    }

    public void setOnCommands(int solt,Command onCommand,Command offCommand){
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;
    }

    public void onButtonWasPushed(int solt){
        onCommands[solt].execute();
    }

    public void offButtonWasPushed(int solt){
        offCommands[solt].execute();
    }

    public String toString(){
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n---Remote Control----\n");
        for(int i=0; i<onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] "+ onCommands[i].getClass().getName()+" "+offCommands[i].getClass().getName() +"\n");
        }
        return stringBuffer.toString();
    }

}
