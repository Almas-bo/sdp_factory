package com.game.abstractfactory;

public class OrcEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new OrcAxe();
    }

    @Override
    public Armor createArmor() {
        return new OrcPlate();
    }
}
