package com.startjava.lesson_2.person;


public class Person {
    String name = "Mark";
    String gender = "Man";
    int age = 20;
    int weight = 65;
    
    boolean learnJava() {
        System.out.println("Может учить Java, может не учить");
        return true;
    
    }
    void go() {
        System.out.println("Максимальная скорость 5 км/час");
    
    }
    void sit() {
        System.out.println("Когда учит Java");
    
    }
    void talk() {
        System.out.println("Говорит на русском языке");
    
    }
    void run() {
        System.out.println("Максимальная скорость 45 км/час");
    }
}
