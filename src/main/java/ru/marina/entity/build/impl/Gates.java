package ru.marina.entity.build.impl;

import ru.marina.entity.build.Construction;

/**
 * Ворота для крепости
 */
public class Gates implements Construction {

    @Override
    public String buildings100() {
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
    public String buildings75() {
        return
                "__       " +
                "___      " +
                "_-------_" +
                "_|__|__|_" +
                "_|__|__|_" +
                "_|__|__|_" +
                "_|__|__|_";
    }

    @Override
    public String buildings50() {
        return
                "__       " +
                "___      " +
                "_-------_" +
                "_|     |_" +
                "_|__|  |_" +
                "_|__|__|_" +
                "_|__|__|_";
    }

    @Override
    public String buildings25() {
        return
                "__       " +
                "___      " +
                "_-------_" +
                "_|     |_" +
                "_|__   |_" +
                "_|__|  |_" +
                "_|__|__|_";
    }
}
