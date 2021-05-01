package ru.marina.entity.build.impl;

import ru.marina.entity.build.Construction;

/**
 * Стена для крепости
 */
public class Wall implements Construction {

    public static final int price = 1000;

    @Override
    public String view() {
        return
                "* * * *" +
                "*******" +
                "*******" +
                "*******" +
                "*******";
    }

    @Override
    public int getArmor() {
        return 1200;
    }
}
