package com.designMode.ObserverMode.SchoolBell;
/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 15:44
 * @Version 1.0
 */

public class StuEventListener implements BellEventListener{
    @Override
    public void heardBell(RingEvent e) {
        if(e.getSound()){
            System.out.println("同学们,上课了");
        }else {
            System.out.println("同学们,下课了");
        }

    }
}
