package com.game.factorymethod;

public class MageFactory extends HeroFactory {
    @Override
    public Hero createHero() {
        return new Mage();
    }
}
