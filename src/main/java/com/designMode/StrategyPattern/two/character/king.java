package com.designMode.StrategyPattern.two.character;

import com.designMode.StrategyPattern.two.behavior.KnifeBehavior;

public class king extends Character {
    public king() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("king ");
        weaponBehavior.useWeapon();
    }
}
