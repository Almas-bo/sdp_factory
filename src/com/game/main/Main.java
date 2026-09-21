package com.game.main;

import com.game.abstractfactory.*;
import com.game.factorymethod.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Part A: Factory Method ===");
        
        // Создаем воина через фабрику
        HeroFactory warriorFactory = new WarriorFactory();
        Hero warrior = warriorFactory.prepareHero();
        warrior.attack();
        
        // Создаем мага через фабрику
        HeroFactory mageFactory = new MageFactory();
        Hero mage = mageFactory.prepareHero();
        mage.attack();
        
        System.out.println("\n=== Part B: Abstract Factory ===");
        
        // Создаем комплект снаряжения для орка
        System.out.println("--- Фракция Орков ---");
        EquipmentFactory orcFactory = new OrcEquipmentFactory();
        Weapon orcAxe = orcFactory.createWeapon();
        Armor orcPlate = orcFactory.createArmor();
        orcAxe.equipWeapon();
        orcPlate.equipArmor();
        
        // Создаем комплект снаряжения для эльфа
        System.out.println("\n--- Фракция Эльфов ---");
        EquipmentFactory elfFactory = new ElfEquipmentFactory();
        Weapon elvenBow = elfFactory.createWeapon();
        Armor elvenLeather = elfFactory.createArmor();
        elvenBow.equipWeapon();
        elvenLeather.equipArmor();
    }
}
