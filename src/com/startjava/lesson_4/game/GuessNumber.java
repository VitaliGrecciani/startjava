package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("Угадай число !");
        System.out.println("У вас 10 попыток");
        for (int stepNumber = 1; stepNumber <= 10; stepNumber++) {
            player1.setCountOfAttempts(stepNumber);
//            enterNumber(player1);
            if (!endAttempts(player1)) {
                break;
            }
//            enterNumber(player2);
            player2.setCountOfAttempts(stepNumber);
            if (!endAttempts(player2)) {
                break;
            }
        }


        System.out.println(Arrays.toString(player1.getGuessNumbers()));
        System.out.println(Arrays.toString(player2.getGuessNumbers()));

        player1.clearGuessNumbers();
        player2.clearGuessNumbers();

    }


    private boolean endAttempts(Player player) {
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
            System.out.println(" Введенное число больше того, что загадал компьютер " + randomNumber );
        } else if (player.getGuessNumber() < randomNumber) {
            System.out.println(" Введенное число меньше того, что загадал компьютер " + randomNumber );
        } else {
            System.out.println(player.getName() + ", Вы угадали c " + player.getCountOfAttempts() + " попытки. Это число - " + randomNumber);
            //            System.out.println (" Вы угадали! " + player.getGuessNumber());
            return true;
        }
        return false;
    }
}