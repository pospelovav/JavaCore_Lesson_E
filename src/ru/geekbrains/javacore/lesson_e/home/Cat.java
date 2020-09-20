package ru.geekbrains.javacore.lesson_e.home;



public class Cat extends Animal{
//    float RunLimit = 200;
//    float SwimLimit = 0;
//    float JumpLimit = 2;

    Cat(String name, String color, int age) {
        super(name, color, age);
        this.RunLimit = (float) (Math.random() * 200 + 50 - (age * 2));  //генерируется максимальная дистанция пробежки от 50 до 250 с учетом возраста
    }


}
