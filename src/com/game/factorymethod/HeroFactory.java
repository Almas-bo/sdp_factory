package com.game.factorymethod;

public abstract class HeroFactory {

    // Шаблонный метод, который использует фабричный метод
    public Hero prepareHero() {
        Hero hero = createHero();
        System.out.println("Подготовка к битве...");
        return hero;
    }

    // Фабричный метод
    public abstract Hero createHero();
}
