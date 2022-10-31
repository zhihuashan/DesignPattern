package com.designMode.ObserverMode.SchoolBell;
/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 15:43
 * @Version 1.0
 */

public class TeachEventListener implements BellEventListener{
    @Override
    public void heardBell(RingEvent e) {
        if(e.getSound()){
            System.out.println("老师上课了");
        }else {
            System.out.println("老师下课了");
        }
    }
}
