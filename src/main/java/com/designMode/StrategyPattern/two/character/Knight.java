package com.designMode.StrategyPattern.two.character;

import com.designMode.StrategyPattern.two.behavior.BowAndArrowBehavior;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Knight");
        weaponBehavior.useWeapon();
    }
}
