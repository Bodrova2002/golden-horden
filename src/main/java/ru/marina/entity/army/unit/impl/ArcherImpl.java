package ru.marina.entity.army.unit.impl;

import ru.marina.entity.army.unit.Archer;
import ru.marina.entity.army.unit.Unit;

/**
 * Лучник крестоносец
 */
public class ArcherImpl extends Unit implements Archer {

    private final int distanceAttack;
    private boolean fireArrows;
    private int accuracy;

    public ArcherImpl(String nameUnit, int live, int damage, int accuracy, int distanceAttack) {
        super(nameUnit, live, damage);
        this.accuracy = accuracy;
        this.distanceAttack = distanceAttack;
    }

    @Override
    public void fireArrows(boolean isFire) {
        fireArrows = isFire;
        if (fireArrows){
            setDamage(getDamage() + 15);
            accuracy -= 10;
        } else {
            setDamage(getDamage() - 15);
            accuracy += 10;
        }
    }

    @Override
    public int attack() {
        return getDamage();
    }

    @Override
    public int movement() {
        return 3;
    }

    @Override
    public String toString() {
        return "ArcherImpl{" +
                "distanceAttack=" + distanceAttack +
                ", fireArrows=" + fireArrows +
                ", accuracy=" + accuracy +
                "} " + super.toString();
    }

    public boolean getFireArrows(){
        return fireArrows;
    }

    public int getDistanceAttack(){
        return distanceAttack;
    }

    public int getAccuracy(){
        return accuracy;
    }
}
