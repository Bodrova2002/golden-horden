package ru.marina.entity.army.unit.impl;

import ru.marina.entity.army.unit.Cavalry;
import ru.marina.entity.army.unit.Unit;

public class CavalryImpl extends Unit implements Cavalry {

    private int armor;
    private boolean isFormWedge;

    public CavalryImpl(String nameUnit, int live, int damage, int armor, int price) {
        super(nameUnit, live, damage, price);
        this.isFormWedge = false;
        this.armor = armor;
    }

    @Override
    public void formWedge(boolean isFormWedge) {
        this.isFormWedge = isFormWedge;
        if (isFormWedge){
            setDamage(getDamage() + 10);
            armor -= 15;
        } else {
            setDamage(getDamage() - 10);
            armor += 15;
        }
    }

    @Override
    public int getLive() {
        return super.getLive() + armor;
    }

    @Override
    public int attack() {
        return getDamage();
    }

    @Override
    public int movement() {
        return 5;
    }

    @Override
    public String toString() {
        return "CavalryImpl{" +
                "armor=" + armor +
                ", isFormWedge=" + isFormWedge +
                "} " + super.toString();
    }

    public boolean getFormWedge() {
        return isFormWedge;
    }

    public int getArmor() {
        return armor;
    }
}
