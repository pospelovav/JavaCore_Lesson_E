package ru.geekbrains.javacore.lesson_e.home;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected float RunLimit;
    protected float SwimLimit;
    protected float JumpLimit;

    public Animal(String name, String color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    String run(float distance){
        String mes = "Run " + String.format("%.1f", distance) + " m, ";
        return mes;
    }

    String swim(float distance){
        String mes = "";
        if (distance == 0) {
            mes = "Refuse to swim, ";
        } else {
            mes = "Swim " + String.format("%.1f", distance) + " m, ";
        }
        return mes;
    }

    String jump(float height){
        String mes = "Jump " + String.format("%.1f", height) + " m";
        return mes;
    }



}
