package ru.marina.entity.army.factory;

import ru.marina.entity.army.unit.Archer;
import ru.marina.entity.army.unit.Cavalry;
import ru.marina.entity.army.unit.Infantry;

public interface ArmyFactory {

    Infantry createInfantry();

    Cavalry createCavalry();

    Archer createArcher();
}
