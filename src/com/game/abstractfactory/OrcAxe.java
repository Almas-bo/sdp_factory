package com.game.abstractfactory;

public class OrcAxe implements Weapon {
    @Override
    public void equipWeapon() {
        System.out.println("Экипирован тяжелый орочий топор.");
    }
}
