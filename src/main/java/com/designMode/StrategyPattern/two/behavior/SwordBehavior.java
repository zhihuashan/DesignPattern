package com.designMode.StrategyPattern.two.behavior;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use  sword");
    }
}
