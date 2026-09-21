package com.game.abstractfactory;

public class ElvenBow implements Weapon {
    @Override
    public void equipWeapon() {
        System.out.println("Экипирован изящный эльфийский лук.");
    }
}
