package ru.marina.entity.build.impl;

import ru.marina.entity.build.Construction;

/**
 * Стена для крепости
 */
public class Wall implements Construction {

    @Override
    public String buildings100() {
        return
                "* * * *" +
                "*******" +
                "*******" +
                "*******" +
                "*******";
    }

    @Override
    public String buildings75() {
        return
                "* *    " +
                "*****  " +
                "*******" +
                "*******" +
                "*******";
    }

    @Override
    public String buildings50() {
        return
                "*      " +
                "****   " +
                "*****  " +
                "*******" +
                "*******";
    }

    @Override
    public String buildings25() {
        return
                "       " +
                "**     " +
                "***    " +
                "*_**   " +
                "*****  ";
    }
}
