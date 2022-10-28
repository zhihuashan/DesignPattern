package com.designMode.StrategyPattern.two.behavior;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}
