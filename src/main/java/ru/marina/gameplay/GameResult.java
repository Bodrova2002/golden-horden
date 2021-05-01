package ru.marina.gameplay;

public class GameResult {

    private boolean gameIsOn;
    private boolean playerWinner;

    public GameResult(boolean gameIsOn, boolean playerWinner) {
        this.gameIsOn = gameIsOn;
        this.playerWinner = playerWinner;
    }

    public boolean isGameIsOn() {
        return gameIsOn;
    }

    public GameResult setGameIsOn(boolean gameIsOn) {
        this.gameIsOn = gameIsOn;
        return this;
    }

    public boolean isPlayerWinner() {
        return playerWinner;
    }

    public GameResult setPlayerWinner(boolean playerWinner) {
        this.playerWinner = playerWinner;
        return this;
    }
}
