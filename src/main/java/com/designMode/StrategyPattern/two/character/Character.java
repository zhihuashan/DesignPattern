package com.designMode.StrategyPattern.two.character;

import com.designMode.StrategyPattern.two.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
    public abstract void fight();
}
