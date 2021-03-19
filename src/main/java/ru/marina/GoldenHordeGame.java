package ru.marina;

import ru.marina.entity.army.factory.ArmyFactory;
import ru.marina.entity.army.factory.impl.CrusadersArmyFactory;

public class GoldenHordeGame {

    public static void main(String[] args) {
        System.out.println("Welcome to golden horder!!!");
        ArmyFactory armyFactory = new CrusadersArmyFactory();
        System.out.println(armyFactory.createArcher());
        System.out.println(armyFactory.createInfantry());
        System.out.println(armyFactory.createCavalry());
    }
}
