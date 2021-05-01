package ru.marina.entity;

import ru.marina.entity.army.factory.ArmyFactory;
import ru.marina.entity.army.unit.Unit;
import ru.marina.entity.build.Castle;
import ru.marina.entity.build.Construction;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private ArmyFactory armyFactory;
    private int money;
    private Castle castle;
    private List<Unit> units;
    private int countPeasants;

    public Player() {
        money = 8000;
        units = new ArrayList<>();
    }

    public Castle getCastle() {
        return castle;
    }

    public Player setCastle(Castle castle) {
        this.castle = castle;
        return this;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public ArmyFactory getArmyFactory() {
        return armyFactory;
    }

    public Player setArmyFactory(ArmyFactory armyFactory) {
        this.armyFactory = armyFactory;
        return this;
    }

    public int getMoney() {
        return money;
    }

    public Player setMoney(int money) {
        this.money = money;
        return this;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public Player setUnits(List<Unit> units) {
        this.units = units;
        return this;
    }

    public int getCountPeasants() {
        return countPeasants;
    }

    public Player setCountPeasants(int countPeasants) {
        this.countPeasants = countPeasants;
        return this;
    }

    public void minusMoney(int summa){
        this.money -= summa;
    }

    public void addUnit(Unit unit){
        units.add(unit);
    }

    public void addMoney(int money){
        this.money += money;
    }

    public int getPowerArmy(){
        int power = 0;
        for (Unit unit : units){
            power += unit.attack();
            power += unit.getLive();
            power += unit.movement();
        }
        return power;
    }

    public int getCastleArmor(){
        int armor = 0;
        for (Construction construction : castle.getBuildings()){
            armor += construction.getArmor();
        }
        return armor;
    }
}
