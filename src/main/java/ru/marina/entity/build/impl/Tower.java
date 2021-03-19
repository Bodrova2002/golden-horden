package ru.marina.entity.build.impl;

import ru.marina.entity.build.Construction;

/**
 * Башня для крепости
 */
public class Tower implements Construction {

    private int live;

    @Override
    public String buildings100() {
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

    @Override
    public String buildings75() {
        return
                "____ __ ____\n" +
                "|**_ || |**|\n" +
                " |* _**_**| \n" +
                "  |******|  \n" +
                "  |**__     \n" +
                "|***|__|***|\n" +
                "|___*******|\n" +
                "|**********|\n";
    }

    @Override
    public String buildings50() {
        return
                "___  _      \n" +
                "|**  |      \n" +
                " |* _**_**| \n" +
                "  |******|  \n" +
                "    *__     \n" +
                "  **|__|***|\n" +
                "|___*******|\n" +
                "|***_____**|\n";
    }

    @Override
    public String buildings25() {
        return
                "__          \n" +
                "|**         \n" +
                " |* _**_    \n" +
                "  |****     \n" +
                "    *__     \n" +
                "  **|__|**  \n" +
                "|___*******|\n" +
                "|***_____**|\n";
    }

    public int getLive() {
        return live;
    }

    public void causeDamage(int damage){
        live -= damage;
    }
}
