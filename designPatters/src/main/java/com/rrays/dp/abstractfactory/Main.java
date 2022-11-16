package com.rrays.dp.abstractfactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactroy abstractFactroy = new ModernFactory();
        abstractFactroy.createTransport().go();
        abstractFactroy.createEat().printName();
        abstractFactroy.createWeapon().shot();
    }
}
