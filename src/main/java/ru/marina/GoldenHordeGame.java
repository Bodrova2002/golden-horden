package ru.marina;

import ru.marina.entity.Player;
import ru.marina.gameplay.Game;

public class GoldenHordeGame {

    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();
        game.welcome();
        game.setNamePlayer(player);
        game.setFraction(player);
        game.createCastle(player);
        game.createArmy(player);
        game.createPeasant(player);
    }
}
