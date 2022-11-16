package com.rrays.dp.abstractfactory;

public class OldFactory extends AbstractFactroy{
    @Override
    Weapon createWeapon() {
        return new MagicToll();
    }

    @Override
    Eat createEat() {
        return new Mushroom();
    }

    @Override
    Transport createTransport() {
        return new WoodenStaff();
    }
}
