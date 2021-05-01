package ru.marina.gameplay;

import ru.marina.entity.Player;

import java.util.Scanner;

import static java.lang.System.*;

public class GamePlay {

    private final Player player;
    private final CreateGame createGame;

    public GamePlay(Player player, CreateGame createGame) {
        this.player = player;
        this.createGame = createGame;
    }

    /**
     * 1) Каждый ход увеличивается казна
     * 2) Есть вероятность быть атакованным разными группами противника
     * 3) Есть вероятность атаковать проходившую группу противника
     * 4) Закупить юнитов
     * 5) Закупить крестьян
     * 6) Атаковать основную армию противника
     */
    public void startGame(){
        GameResult gameResult = new GameResult(true, false);
        while(gameResult.isGameIsOn()) {
            player.addMoney(getMoney());
            generationAttackEnemy(gameResult);
            if (gameResult.isGameIsOn()) {
                generationAttackOnEnemy(gameResult);
                attackToBaseEnemy(gameResult);
                createGame.createArmy(player);
                createGame.createPeasant(player);
            }
        }
        out.println("Игра закончена");
        if (gameResult.isPlayerWinner()) {
            out.println("Вы одержали победу!!! ПОЗДРАВЛЯЕМ!!!");
        } else {
            out.println("К сожалению вы проиграли, ваш замок разрушен :(");
        }
    }

    private int getMoney(){
        return player.getCountPeasants() * (int)(Math.random()*10);
    }

    private void generationAttackEnemy(GameResult gameResult){
        if (Math.random()*100 > 50) {
            out.println("На ваш замок решил напасть вражеский отряд");
            int powerAttack = (int) (Math.random() * 1000);
            int playerPower = player.getPowerArmy() + player.getCastleArmor();
            boolean winnerPlayer = (playerPower*(Math.random()*1.5) - powerAttack*(Math.random()*1.5)) >= 0;
            if (winnerPlayer){
                player.addMoney(powerAttack);
                out.println("Вы отбили атаку и получило " + powerAttack + " дукатов");
            } else {
                out.println("Ваш замок захвачен");
                gameResult.setGameIsOn(false);
            }
        }
    }

    private void generationAttackOnEnemy(GameResult gameResult){
        if (Math.random()*100 > 50) {
            int powerAttack = (int) (Math.random() * 10000);
            out.println("Рядом с замком проходит вражеский отряд, будете нападать? силы врага - " + powerAttack);
            out.println("Ваши силы - " + player.getPowerArmy());
            out.println("1 - напасть");
            out.println("0 - пропустить");
            Scanner scanner = new Scanner(in);
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                int playerPower = player.getPowerArmy();
                boolean winnerPlayer = (playerPower * (Math.random() * 1.5) - powerAttack * (Math.random() * 1.5)) >= 0;
                if (winnerPlayer) {
                    player.addMoney(powerAttack);
                    out.println("В этой битве вы победили и получили " + powerAttack + " дукатов");
                } else {
                    out.println("Не удалось победить врага, вы теряете 1000 дукатов");
                    player.addMoney(-1000);
                }
            }
        }
    }

    private void attackToBaseEnemy(GameResult gameResult){
        out.println("Будете нападать на главную армию врага? Сила его войск - 150000");
        out.println("Ваши силы - " + player.getPowerArmy());
        out.println("1 - напасть");
        out.println("0 - пропустить");
        Scanner scanner = new Scanner(in);
        String answer = scanner.nextLine();
        if (answer.equals("1")) {
            int playerPower = player.getPowerArmy();
            boolean winnerPlayer = (playerPower * (Math.random() * 1.5) - 150000 * (Math.random() * 1.5)) >= 0;
            if (winnerPlayer) {
                player.addMoney(150000);
                out.println("Ура армия врага побеждена");
                gameResult.setGameIsOn(false);
                gameResult.setPlayerWinner(true);
            } else {
                out.println("К сожалению не удалось победить армию врага");
                player.setMoney(0);
            }
        }
    }
}
