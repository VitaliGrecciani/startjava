package com.startjava.lesson_2.robot;

public class Jaeger {

   private String modelName;
    private String mark;
    private String origin;
    private String equipment;
    private String energyCore;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin,
                  String equipment, String energyCore, float height,
                  float weight, int speed, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.energyCore = energyCore;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт.");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов.");
    }

    public String toString() {
        return "Jaeger{ "
                + "modelName:'" + this.modelName + '\''
                + ", mark: " + this.mark
                + ", origin: " + this.origin
                + ", equipment: " + this.equipment
                + ", energyCore: " + this.energyCore
                + ", height: " + this.height + 'm'
                + ", weight: " + this.weight + "Tons"
                + ", speed: " + this.speed
                + ", armor: " + this.armor
                + '}';
    }
}