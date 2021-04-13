package ru.marina.gameplay;

import ru.marina.entity.Player;
import ru.marina.entity.army.factory.impl.CrusadersArmyFactory;
import ru.marina.entity.army.factory.impl.HordeArmyFactory;
import ru.marina.entity.army.factory.impl.RusichiArmyFactory;
import ru.marina.entity.army.unit.Peasant;
import ru.marina.entity.army.unit.Unit;
import ru.marina.entity.build.Castle;
import ru.marina.entity.build.impl.Gates;
import ru.marina.entity.build.impl.Tower;
import ru.marina.entity.build.impl.Wall;

import java.util.Scanner;

import static java.lang.System.*;

public class Game {

    public void welcome() {
        out.println("Добро пожаловать в Golden-Horden");
    }

    public void setNamePlayer(Player player) {
        Scanner in = new Scanner(System.in);
        out.println("Введите имя");
        String name = in.nextLine();
        player.setName(name);
    }

    public void setFraction(Player player) {
        out.println(player.getName() + "выберите фракцию");
        out.println("Русичи - 1");
        out.println("Монголы - 2");
        out.println("Крестоносцы - 3");
        Scanner in = new Scanner(System.in);
        int fraction = in.nextInt();
        if (fraction == 1) {
            player.setArmyFactory(new RusichiArmyFactory());
        } else if (fraction == 2) {
            player.setArmyFactory(new HordeArmyFactory());
        } else if (fraction == 3) {
            player.setArmyFactory(new CrusadersArmyFactory());
        } else {
            out.println("Вы ввели неверно число !!!");
            out.println("Выберите 1 или 2 или 3");
        }
    }

    public void createCastle(Player player) {
        out.println(player.getName() + " давайте приступим к постройке замка");
        Castle.CastleBuilder castleBuilder = new Castle.CastleBuilder();
        Scanner in = new Scanner(System.in);
        while (true) {
            out.println("У вас " + player.getMoney() + " дукатов");
            out.println("Выберите что построить");
            out.println("Башня - 1");
            out.println("Стена - 2");
            out.println("Ворота - 3");
            out.println("0 - выход");
            int construction = in.nextInt();
            if (construction == 1) {
                if (isCanPay(player.getMoney(), Tower.price)) {
                    castleBuilder.addTower();
                    player.minusMoney(Tower.price);
                }
            } else if (construction == 2) {
                if (isCanPay(player.getMoney(), Wall.price)) {
                    castleBuilder.addWall();
                    player.minusMoney(Wall.price);
                }
            } else if (construction == 3) {
                if (isCanPay(player.getMoney(), Gates.price)) {
                    castleBuilder.addGates();
                    player.minusMoney(Gates.price);
                }
            } else if (construction == 0) {
                break;
            } else {
                out.println("Вы ввели не то число");
            }
        }
        player.setCastle(castleBuilder.build());
    }

    public void createArmy(Player player) {
        out.println(player.getName() + " пора создать армию");
        Scanner in = new Scanner(System.in);
        while (true) {
            out.println("У вас " + player.getMoney() + " дукатов");
            out.println("Выберите какой юнит нанять");
            out.println("Всадник - 1");
            out.println("Пехотинец - 2");
            out.println("Лучник - 3");
            out.println("0 - выход");
            int construction = in.nextInt();
            if (construction == 1) {
                Unit unit = (Unit) player.getArmyFactory().createCavalry();
                if (isCanPay(player.getMoney(), unit.getPrice())) {
                    player.addUnit(unit);
                    player.minusMoney(unit.getPrice());
                }
            } else if (construction == 2) {
                Unit unit = (Unit) player.getArmyFactory().createInfantry();
                if (isCanPay(player.getMoney(), unit.getPrice())) {
                    player.addUnit(unit);
                    player.minusMoney(unit.getPrice());
                }
            } else if (construction == 3) {
                Unit unit = (Unit) player.getArmyFactory().createArcher();
                if (isCanPay(player.getMoney(), unit.getPrice())) {
                    player.addUnit(unit);
                    player.minusMoney(unit.getPrice());
                }
            } else if (construction == 0) {
                break;
            } else {
                out.println("Вы ввели не то число");
            }
        }
    }

    public void createPeasant(Player player){
        out.println("Введите сколько вы хотие приобрести крестьян");
        Scanner in = new Scanner(System.in);
        while (true){
            out.println("У вас " + player.getMoney() + " дукатов");
            out.println("Введите количество");
            int count = in.nextInt();
            if (isCanPay(player.getMoney(), count* Peasant.price)) {
                player.setCountPeasants(count);
                break;
            }
            out.println("Вы не можете купить столько крестьян");
        }
    }

    private boolean isCanPay(int money, int price) {
        return money - price >= 0;
    }
}
