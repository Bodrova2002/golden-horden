package ru.marina.entity.army.factory.impl;

import ru.marina.entity.army.factory.ArmyFactory;
import ru.marina.entity.army.unit.Archer;
import ru.marina.entity.army.unit.Cavalry;
import ru.marina.entity.army.unit.Infantry;
import ru.marina.entity.army.unit.impl.ArcherImpl;
import ru.marina.entity.army.unit.impl.CavalryImpl;
import ru.marina.entity.army.unit.impl.InfantryImpl;

/**
 * Реализация фабрики армии русичей
 */
public class RusichiArmyFactory implements ArmyFactory {

    @Override
    public Infantry createInfantry() {
        return new InfantryImpl("Russian warior",90, 50, 50, 90);
    }

    @Override
    public Cavalry createCavalry() {
        return new CavalryImpl("Russian cavalry", 100, 70, 70, 130);
    }

    @Override
    public Archer createArcher() {
        return new ArcherImpl("Russian archer",90, 25, 25, 5, 80);
    }
}
