package com.designMode.StrategyPattern.two.behavior;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use axe");
    }
}
