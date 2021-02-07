package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator casio = new Calculator();
        Scanner sc = new Scanner(System.in);
        char repeat;
        
        do {
                System.out.print("Введите первое число:");
                casio.setNum1(sc.nextInt());
                sc.nextLine();

                System.out.print("Введите знак математической операции:");
                casio.setOperation(sc.nextLine().charAt(0));
                
                System.out.print("Введите второе число:");
                casio.setNum2(sc.nextInt());
                sc.nextLine();
                casio.calculate();
                
                do {
                        System.out.println("Хотите продолжить? [д/н]:");
                        repeat = sc.next().charAt(0);
                } while (repeat != 'д' && repeat != 'н');
        } while (repeat != 'н');
    }
}

