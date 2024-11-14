package com.designMode.StrategyPattern.AppearanceMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:38
 * @Version 1.0
 */

public class Computer {
    SmsService aliSmsService;
    SmsService eamilSmsService;
    SmsService weiXinSmsService;

    public Computer(){
        aliSmsService = new AliSmsServiceImpl();
        eamilSmsService = new EamilSmsServiceImpl();
        weiXinSmsService = new WeiXinSmsServiceImpl();
    }
    //只需要调用
    public void sendMsg(){
        aliSmsService.sendSms();
        eamilSmsService.sendSms();
        weiXinSmsService.sendSms();
    }
}
