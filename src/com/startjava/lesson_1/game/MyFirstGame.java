package com.startjava.lesson_1.game;

public class MyFirstGame {
		public static void main(String[] args) {
			int correctNumber = 13;
			int inputNumber = 50;

			while(inputNumber != correctNumber) {
				if (inputNumber < correctNumber) {
					System.out.println("Введеное вами число меньше того, что загадал компьютер");
					inputNumber++;
				} else if(inputNumber > correctNumber) {
					System.out.println("Введеное вами число больше того, что загадал компьютер");
					inputNumber--;
			}
		}	
		System.out.println("Вы угадали " + correctNumber);	
	}
}