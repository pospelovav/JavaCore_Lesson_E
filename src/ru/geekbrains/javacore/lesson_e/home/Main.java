package ru.geekbrains.javacore.lesson_e.home;


public class Main {
    public static void main (String[] args){
        Cat catOne = new Cat("Barseek", "White", 3);
        Dog dogOne = new Dog("Toozeek", "Black", 5);
        //System.out.println(catOne.RunLimit);
        float RunDistance = 200;   //дистанция забега для всех животных
        String animalType = "";
       // dogOne.run(150);
        Animal[] OurAnimals = {catOne, dogOne};
        for (int i = 0; i < OurAnimals.length; i++) {
            if (OurAnimals[i] instanceof Cat){
                animalType = "Cat";
            }
            if (OurAnimals[i] instanceof Dog){
                animalType = "Dog";
            }
            if (OurAnimals[i].run(RunDistance)){
                System.out.print(animalType + " '" + OurAnimals[i].name + "' is Run! ");
                System.out.println("'" + OurAnimals[i].name + "' can run " + String.format("%.1f",OurAnimals[i].RunLimit) + " m");
            } else {
                System.out.print(animalType + " '" + OurAnimals[i].name + "' do not Run! ");
                System.out.println("'" + OurAnimals[i].name + "' could only run " + String.format("%.1f",OurAnimals[i].RunLimit) + " m");
            }


        }

    }

}
