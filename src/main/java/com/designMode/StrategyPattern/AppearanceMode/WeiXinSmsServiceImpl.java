package com.designMode.StrategyPattern.AppearanceMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:40
 * @Version 1.0
 */

public class WeiXinSmsServiceImpl implements SmsService{
    @Override
    public void sendSms() {
        System.out.println("发送微信消息推送");
    }
}
