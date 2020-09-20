package ru.geekbrains.javacore.lesson_e.home;

public class Dog extends Animal{
//    float RunLimit = 500;
//    float SwimLimit = 10;
//    float JumpLimit = 0.5f;

    Dog(String name, String color, int age) {
        super(name, color, age);
        this.RunLimit = 500;
    }


}
