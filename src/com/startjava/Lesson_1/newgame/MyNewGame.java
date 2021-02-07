package com.startjava.lesson_1.newgame;

public class MyNewGame {
    public static void main(String[] args) {
        int correctNumber = 13;
        int inputNumber = 50;
        
        do {
            if (inputNumber < correctNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                inputNumber++;
            } else if (inputNumber > correctNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                inputNumber--;
            }
        } while (inputNumber != correctNumber);
        System.out.println("Вы угадали " + correctNumber);
    }
}