package ru.marina.entity.build.impl;

import ru.marina.entity.build.Construction;

/**
 * Башня для крепости
 */
public class Tower implements Construction {

    public static final int price = 1500;

    @Override
    public String view() {
        return
                "____ __ ____\n" +
                "|**| || |**|\n" +
                " |**_**_**| \n" +
                "  |******|  \n" +
                "  |**__**|  \n" +
                "|***|__|***|\n" +
                "|**********|\n" +
                "|**********|\n";
    }
}
