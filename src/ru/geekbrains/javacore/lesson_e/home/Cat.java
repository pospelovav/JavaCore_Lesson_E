package ru.geekbrains.javacore.lesson_e.home;

public class Cat extends Animal{

    Cat(String name, String color, int age) {
        super(name, color, age);
        this.RunLimit = 300 - age*1f * 50;  //считается максимальная дистанция пробежки с учетом возраста
        this.SwimLimit = 0;
        this.JumpLimit = 3 - age*1f/2;  //считается максимальная высота прыжка с учетом возраста
    }


}
