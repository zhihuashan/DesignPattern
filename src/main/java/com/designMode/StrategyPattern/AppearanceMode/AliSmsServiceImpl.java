package com.designMode.StrategyPattern.AppearanceMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:35
 * @Version 1.0
 */

public class AliSmsServiceImpl implements SmsService{
    @Override
    public void sendSms() {
        System.out.println("阿里短信消息");
    }
}
