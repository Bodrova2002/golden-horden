package ru.marina.entity.build.impl;

import ru.marina.entity.build.Construction;

/**
 * Ворота для крепости
 */
public class Gates implements Construction {

    public static final int price = 1200;

    @Override
    public String view() {
        return
                "_________" +
                "_________" +
                "_-------_" +
                "_|__|__|_" +
                "_|__|__|_" +
                "_|__|__|_" +
                "_|__|__|_";
    }

    @Override
    public int getArmor() {
        return 1000;
    }
}
