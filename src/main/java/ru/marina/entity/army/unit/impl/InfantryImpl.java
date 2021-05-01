package ru.marina.entity.army.unit.impl;

import ru.marina.entity.army.unit.Infantry;
import ru.marina.entity.army.unit.Unit;

public class InfantryImpl extends Unit implements Infantry {

    private int armor;
    private boolean isCloseShields;

    public InfantryImpl(String nameUnit, int live, int damage, int armor, int price) {
        super(nameUnit, live, damage, price);
        this.isCloseShields = false;
        this.armor = armor;
    }

    @Override
    public void closeShields(boolean isCloseShields) {
        this.isCloseShields = isCloseShields;
        if (isCloseShields){
            setDamage(getDamage()-10);
            armor += 15;
        } else {
            setDamage(getDamage()+10);
            armor -= 15;
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
        return 2;
    }

    @Override
    public String toString() {
        return "InfantryImpl{" +
                "armor=" + armor +
                ", isCloseShields=" + isCloseShields +
                "} " + super.toString();
    }

    public int getArmor() {
        return armor;
    }

    public boolean getCloseShields() {
        return isCloseShields;
    }
}
