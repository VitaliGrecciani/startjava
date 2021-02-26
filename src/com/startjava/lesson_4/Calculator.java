package com.startjava.lesson_4;

public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public void setNum1(int num1) {

        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperation(char operation) {

        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                System.out.println("Результат "+ num1 + operation  + num2 + "=" + Math.addExact(num1, num2));
                break;
            case '-':
                System.out.println( "Результат " + num1  + operation + num2 + "=" + Math.subtractExact(num1, num2));
                break;
            case '*':
                System.out.println("Результат " +  num1 + operation + num2 + "=" + Math.multiplyExact(num1, num2));
                break;
            case '/':
                System.out.println( "Результат " + num1 + operation + num2 + "=" + Math.floorDiv(num1, num2));
                break;
            case '^':
                System.out.println( "Результат " + num1 + operation + num2 + "=" + (int) Math.pow(num1, num2));
                break;
            case '%':
                System.out.println("Результат " +  num1 + operation + num2 + "=" + Math.IEEEremainder(num1, num2));
                break;
            default:
                System.out.println(" ");
        }
    }
}

