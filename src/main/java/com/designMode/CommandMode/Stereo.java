package com.designMode.CommandMode;

public class Stereo {
    public void on(){
        System.out.println("打开音响");
    }
    public void setCD(){
        System.out.println("选取cd");
    }

    public void setVolume(Integer a){
        System.out.println("音量："+a );
    }
}
