package com.game.factorymethod;

public class Warrior implements Hero {
    @Override
    public void attack() {
        System.out.println("Воин наносит удар мечом");
    }
}
