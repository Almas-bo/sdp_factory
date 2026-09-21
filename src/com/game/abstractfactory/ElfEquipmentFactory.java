package com.game.abstractfactory;

public class ElfEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new ElvenBow();
    }

    @Override
    public Armor createArmor() {
        return new ElvenLeather();
    }
}
