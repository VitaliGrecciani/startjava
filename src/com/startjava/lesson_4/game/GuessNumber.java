package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

 /*   public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("Угадай число !");
        System.out.println("У вас 10 попыток");
        int stepNumber = 1; stepNumber < 11; stepNumber++;
        do   {
            player1.setCountOfAttempts(stepNumber);
//            enterNumber(player1);
            if (!makeMove(player1)) {
                break;
            }
//            enterNumber(player2);
            player2.setCountOfAttempts(stepNumber);
            if (!makeMove(player2)) {
                break;
            }
        } while(true);
    }

    private boolean makeMove(Player player) {
        enterNumber(player);
        if (!compareNumbers(player)) {
            if (player.getCountOfAttempts() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
            return true;
        } else return false;
    }


    private void enterNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.putGuessNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getGuessNumber() > randomNumber) {
            System.out.println(" введенное число больше того, что загадал компьютер " + randomNumber );
        } else if (player.getGuessNumber() < randomNumber) {
            System.out.println(" введенное число меньше того, что загадал компьютер " + randomNumber );
        } else {
            System.out.println (" Вы угадали! " + player.getGuessNumber());
            return true;
        } return false;
    }
}

