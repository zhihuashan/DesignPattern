package com.designMode.StrategyPattern.AppearanceMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:36
 * @Version 1.0
 */

public class EamilSmsServiceImpl implements SmsService{
    @Override
    public void sendSms() {
        System.out.println("发送邮件消息");
    }
}
