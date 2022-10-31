package com.designMode.BuilderMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 19:24
 * @Version 1.0
 */
//复杂对象创建的哪些部分需要什么属性
public class ArmsBuilder implements PersonBuilder{
    private Arms arms;
    // 创建arms实例
    public ArmsBuilder() {
        arms = new Arms();
    }

    @Override
    public void builderHelmetMurder() {
        arms.setHelmet("夺命头盔");
    }

    @Override
    public void builderArmorMurder() {
        arms.setArmor("夺命铠甲");
    }

    @Override
    public void builderWeaponMurder() {
        arms.setWeapon("夺命宝刀");
    }

    @Override
    public void builderHelmetYanLong() {
        arms.setHelmet("炎龙头盔");
    }

    @Override
    public void builderArmorYanLong() {
        arms.setArmor("炎龙铠甲");
    }

    @Override
    public void builderWeaponYanLong() {
        arms.setWeapon("炎龙宝刀");
    }

    @Override
    public Arms BuilderArms() {
        return this.arms;
    }
}
