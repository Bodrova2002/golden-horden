package ru.marina.entity.army.unit;

/**
 * Родительский класс для юнитов
 */
public abstract class Unit {

    /**
     * Имя юнита
     */
    private final String nameUnit;

    /**
     * Количество жизней юнита
     */
    private int live;

    /**
     * Урон наносимый юнитом
     */
    private int damage;

    public Unit(String nameUnit, int live, int damage) {
        this.nameUnit = nameUnit;
        this.live = live;
        this.damage = damage;
    }

    /**
     * Атаковать
     */
    public abstract int attack();

    /**
     * Передвижение
     */
    public abstract int movement();

    @Override
    public String toString() {
        return "Unit{" +
                "nameUnit='" + nameUnit + '\'' +
                ", live=" + live +
                ", damage=" + damage +
                '}';
    }

    public String getNameUnit() {
        return nameUnit;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }
}
