package com.designMode.AppearanceMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:42
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        //普通模式需要这样
        AliSmsService aliSmsService= new AliSmsServiceImpl();
        EamilSmsService eamilSmsService= new EamilSmsServiceImpl();
        WeiXinSmsService weiXinSmsService = new WeiXinSmsServiceImpl();
        aliSmsService.sendSms();
        eamilSmsService.sendSms();
        weiXinSmsService.sendSms();

        //简化
        new Computer().sendMsg();
    }
}
