package com.designMode.StrategyPattern.AppearanceMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:42
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        //普通模式需要这样
        SmsService aliSmsService= new AliSmsServiceImpl();
        SmsService eamilSmsService= new EamilSmsServiceImpl();
        SmsService weiXinSmsService = new WeiXinSmsServiceImpl();
        aliSmsService.sendSms();
        eamilSmsService.sendSms();
        weiXinSmsService.sendSms();

        //简化
        new Computer().sendMsg();
    }
}
