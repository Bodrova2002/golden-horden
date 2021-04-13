package ru.marina.entity.army.factory.impl;

import ru.marina.entity.army.factory.ArmyFactory;
import ru.marina.entity.army.unit.Archer;
import ru.marina.entity.army.unit.Cavalry;
import ru.marina.entity.army.unit.Infantry;
import ru.marina.entity.army.unit.impl.ArcherImpl;
import ru.marina.entity.army.unit.impl.CavalryImpl;
import ru.marina.entity.army.unit.impl.InfantryImpl;

/**
 * Реализация фабрики армии орды
 */
public class HordeArmyFactory implements ArmyFactory {

    @Override
    public Infantry createInfantry() {
        return new InfantryImpl("Horder",80, 20, 30, 90);
    }

    @Override
    public Cavalry createCavalry() {
        return new CavalryImpl("Cavalry horder", 90, 35, 40, 120);
    }

    @Override
    public Archer createArcher() {
        return new ArcherImpl("Horder archer",70, 30, 30, 6, 90);
    }
}
