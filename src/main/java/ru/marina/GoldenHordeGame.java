package ru.marina;

import ru.marina.entity.Player;
import ru.marina.gameplay.CreateGame;
import ru.marina.gameplay.GamePlay;

public class GoldenHordeGame {

    public static void main(String[] args) {
        CreateGame createGame = new CreateGame();
        Player player = new Player();
        GamePlay gamePlay = new GamePlay(player, createGame);

        createGame.welcome();
        createGame.setNamePlayer(player);
        createGame.setFraction(player);
        createGame.createCastle(player);
        createGame.createArmy(player);
        createGame.createPeasant(player);

        gamePlay.startGame();
    }
}
