package com.designMode.StrategyPattern.two.character;

import com.designMode.StrategyPattern.two.behavior.SwordBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Queen");
        weaponBehavior.useWeapon();
    }
}
