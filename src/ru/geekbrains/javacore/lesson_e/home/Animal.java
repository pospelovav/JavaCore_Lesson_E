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

    boolean run(float distance){
        if (distance <= RunLimit) {
            return true;
        }
        return false;
    }
}
