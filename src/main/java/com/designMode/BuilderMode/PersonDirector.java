package com.designMode.BuilderMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 19:37
 * @Version 1.0
 */
// 使用建造者 创建复杂的对象
public class PersonDirector {
    // 组装
    public Arms constructPerson(PersonBuilder pb){
        pb.builderHelmetYanLong();
        pb.builderArmorMurder();
        pb.builderWeaponMurder();
        return pb.BuilderArms();
    }
    // 测试
    public static void main(String[] args) {
        PersonDirector pb = new PersonDirector();
        Arms arms = pb.constructPerson(new ArmsBuilder());
        System.out.println(arms.getHelmet());
        System.out.println(arms.getArmor());
        System.out.println(arms.getWeapon());
    }
}
