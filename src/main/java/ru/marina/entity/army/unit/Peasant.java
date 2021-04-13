package ru.marina.entity.army.unit;

public class Peasant {

    public static final int price = 30;

    private int power;
    private int live;

    public Peasant(int power, int live) {
        this.power = power;
        this.live = live;
    }

    public int getPower() {
        return power;
    }

    public Peasant setPower(int power) {
        this.power = power;
        return this;
    }

    public int getLive() {
        return live;
    }

    public Peasant setLive(int live) {
        this.live = live;
        return this;
    }
}
