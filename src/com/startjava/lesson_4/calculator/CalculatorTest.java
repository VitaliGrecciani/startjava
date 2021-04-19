package com.startjava.lesson_4.calculator;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String mathExpression = scanner.nextLine();
        String[] mathExpressionArray = mathExpression.split(" ");

        Calculator casio = new Calculator();
        casio.setNum1(parseInt(mathExpressionArray[0]));
        casio.setOperation(mathExpressionArray[1].charAt(0));
        casio.setNum2(parseInt(mathExpressionArray[2]));
        casio.calculate();
    }
}