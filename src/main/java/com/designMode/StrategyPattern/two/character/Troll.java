package com.designMode.StrategyPattern.two.character;

import com.designMode.StrategyPattern.two.behavior.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior  = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll");
        weaponBehavior.useWeapon();
    }
}
