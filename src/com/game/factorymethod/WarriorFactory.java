package com.game.factorymethod;

public class WarriorFactory extends HeroFactory {
    @Override
    public Hero createHero() {
        return new Warrior();
    }
}
