package PrototypeMode;

import java.util.ArrayList;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:28
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        // 创建User原型对象
        User user = new User();
        user.setName("李三");
        user.setPassword("123");
        ArrayList<String> phones = new ArrayList<>();
        phones.add("1223");
        user.setPhones(phones);

        // copy一个User对象，并且对象的属性
        User user1 = user.clone();
        user1.setPassword("2355");

        // 判读两个对象是否相同
        System.out.println(user == user1);

        //查看属性内容
        System.out.println(user.getName() + " | " + user1.getName());
        System.out.println(user.getPassword() + " | " + user1.getPassword());
        //查看对于引用类型拷贝
        System.out.println(user.getPhones() == user1.getPhones());

    }
}
