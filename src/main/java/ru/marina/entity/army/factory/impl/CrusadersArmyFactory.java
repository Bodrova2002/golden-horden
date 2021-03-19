package ru.marina.entity.army.factory.impl;

import ru.marina.entity.army.factory.ArmyFactory;
import ru.marina.entity.army.unit.Archer;
import ru.marina.entity.army.unit.Cavalry;
import ru.marina.entity.army.unit.Infantry;
import ru.marina.entity.army.unit.impl.ArcherImpl;
import ru.marina.entity.army.unit.impl.CavalryImpl;
import ru.marina.entity.army.unit.impl.InfantryImpl;

/**
 * Реализация фабрики армии крестоностцев
 */
public class CrusadersArmyFactory implements ArmyFactory {

    @Override
    public Infantry createInfantry() {
        return new InfantryImpl("Crusader",100, 50, 90);
    }

    @Override
    public Cavalry createCavalry() {
        return new CavalryImpl("Cavalry crusader", 120, 50, 80);
    }

    @Override
    public Archer createArcher() {
        return new ArcherImpl("Archer Crusader",100, 20, 30, 5);
    }
}
