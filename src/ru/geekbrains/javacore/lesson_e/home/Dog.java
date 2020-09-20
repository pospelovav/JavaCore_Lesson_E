package ru.geekbrains.javacore.lesson_e.home;

public class Dog extends Animal{

    Dog(String name, String color, int age) {
        super(name, color, age);
        this.RunLimit = 650 - age*1f * 65; //считается максимальная дистанция пробежки с учетом возраста
        this.SwimLimit = 15 - age*1.1f;  //считается максимальная дистанция заплыва с учетом возраста
        this.JumpLimit = 2 - age*1f/5;  //считается максимальная высота прыжка с учетом возраста
    }


}
