package com.game.factorymethod;

public class Mage implements Hero {
    @Override
    public void attack() {
        System.out.println("Маг выпускает огненный шар");
    }
}
