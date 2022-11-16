package com.rrays.dp.abstractfactory;

public class ModernFactory extends AbstractFactroy{
    @Override
    Weapon createWeapon() {
        return new Ak47();
    }

    @Override
    Eat createEat() {
        return new Bread();
    }

    @Override
    Transport createTransport() {
        return new Car();
    }
}
