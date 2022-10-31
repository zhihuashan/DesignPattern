package com.designMode.BuilderMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 19:18
 * @Version 1.0
 */
// 装备类
public class Arms {
    // 头盔
    private String helmet;
    // 铠甲
    private String armor;
    // 武器
    private String weapon;

    public Arms(String helmet, String armor, String weapon) {
        this.helmet = helmet;
        this.armor = armor;
        this.weapon = weapon;
    }

    public Arms() {
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Arms{" +
                "helmet='" + helmet + '\'' +
                ", armor='" + armor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
