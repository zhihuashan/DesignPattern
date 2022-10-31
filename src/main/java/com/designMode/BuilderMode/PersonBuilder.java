package com.designMode.BuilderMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 19:20
 * @Version 1.0
 */
//抽象成接口以规范产品对象的各个组成成分
public interface PersonBuilder {
    void builderHelmetMurder();
    void builderArmorMurder();
    void builderWeaponMurder();
    void builderHelmetYanLong();
    void builderArmorYanLong();
    void builderWeaponYanLong();
    Arms BuilderArms();// 组装
}
