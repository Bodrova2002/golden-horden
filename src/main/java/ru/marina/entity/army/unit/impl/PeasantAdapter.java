package ru.marina.entity.army.unit.impl;

import ru.marina.entity.army.unit.Infantry;
import ru.marina.entity.army.unit.Peasant;
import ru.marina.entity.army.unit.Unit;

public class PeasantAdapter extends Unit implements Infantry {

    Peasant peasant;

    public PeasantAdapter(Peasant peasant) {
        super("Peasant", peasant.getLive(), peasant.getPower()*2, 0);
        this.peasant = peasant;
    }

    @Override
    public void closeShields(boolean isCloseShields) {
        System.out.println("не умеем смыкать щиты");
    }

    @Override
    public int attack() {
        return peasant.getPower()*2;
    }

    @Override
    public int movement() {
        return 2;
    }
}
