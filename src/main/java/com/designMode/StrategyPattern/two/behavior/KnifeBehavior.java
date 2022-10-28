package com.designMode.StrategyPattern.two.behavior;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use knife ");
    }
}
