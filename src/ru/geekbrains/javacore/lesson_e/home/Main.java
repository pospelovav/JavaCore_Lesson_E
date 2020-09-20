package ru.geekbrains.javacore.lesson_e.home;


public class Main {
    public static void main (String[] args){
        Cat catOne = new Cat("Vasya", "Grey", 2);
        Cat catTwo = new Cat("Murzik", "Black&White", 1);
        Dog dogOne = new Dog("Sharik", "White&Grey", 3);
        Dog dogTwo = new Dog("Bor", "Brown", 7);
        Cat catTree = new Cat("Barseek", "White", 3);
        Dog dogTree = new Dog("Toozeek", "Black", 5);

        String animalType = "";

        Animal[] OurAnimals = {catOne, catTwo, catTree, dogOne, dogTwo, dogTree};
        for (int i = 0; i < OurAnimals.length; i++) {
            if (OurAnimals[i] instanceof Cat) {
                animalType = "Cat";
            }
            if (OurAnimals[i] instanceof Dog) {
                animalType = "Dog";
            }
            System.out.print(animalType + " '" + OurAnimals[i].name + "': ");
            System.out.print(OurAnimals[i].run(OurAnimals[i].RunLimit));
            System.out.print(OurAnimals[i].swim(OurAnimals[i].SwimLimit));
            System.out.print(OurAnimals[i].jump(OurAnimals[i].JumpLimit));
            System.out.println();

        }


    }

}
