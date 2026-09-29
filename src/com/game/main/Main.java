package com.game.main;

import com.game.abstractfactory.*;
import com.game.factorymethod.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Part A: Factory Method ===");

        // Выбираем фабрику героя по ответу пользователя
        int heroChoice = askChoice(scanner, "Кого создать? 1 - Воин, 2 - Маг: ");
        HeroFactory heroFactory = (heroChoice == 1) ? new WarriorFactory() : new MageFactory();

        // Дальше код работает только с абстракциями и не знает, какой герой создан
        Hero hero = heroFactory.prepareHero();
        hero.attack();

        System.out.println("\n=== Part B: Abstract Factory ===");

        // Выбираем фабрику снаряжения по ответу пользователя
        int factionChoice = askChoice(scanner, "Выберите фракцию: 1 - Орки, 2 - Эльфы: ");
        EquipmentFactory equipmentFactory = (factionChoice == 1)
                ? new OrcEquipmentFactory()
                : new ElfEquipmentFactory();

        // Одна фабрика создает согласованный комплект оружия и брони
        Weapon weapon = equipmentFactory.createWeapon();
        Armor armor = equipmentFactory.createArmor();
        weapon.equipWeapon();
        armor.equipArmor();
    }

    // Спрашивает, пока пользователь не введет 1 или 2
    private static int askChoice(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextLine()) {
                throw new IllegalStateException("Ввод закончился, выбор не сделан.");
            }
            String input = scanner.nextLine().trim();
            if (input.equals("1") || input.equals("2")) {
                return Integer.parseInt(input);
            }
            System.out.println("Введите 1 или 2.");
        }
    }
}
