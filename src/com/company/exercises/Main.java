package com.company.exercises;

import com.company.exercises.composition.Muzzle;
import com.company.exercises.composition.MuzzleDog;
import com.company.exercises.encapsulation.Dog;
import com.company.exercises.enums.Planets;
import com.company.exercises.inheritance.*;

public class Main {

    public static void main(String[] args) {

        // Encapsulation
        Dog dog = new Dog("King", 5, "male", "dalmatian", 50);
        System.out.println(dog.getAge());

        Dog dog1 = new Dog();
        System.out.println(((Dog) dog1).getRace());


        // Inheritance
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Animal[] box = new Animal[]{new DogB(), new Cat()};

        for (int i = 0; i < box.length; i++)
            box[i].yieldVoice();


        // Composition

        Muzzle muzzle = new Muzzle("blue", 20, "synthetic");
        MuzzleDog muzzleDog = new MuzzleDog();


        muzzleDog.setMuzzle(muzzle);
        printMuzzleAttributes(muzzleDog);


    }

    private static void printMuzzleAttributes(MuzzleDog muzzleDog) {
        System.out.println("Muzzle's color: " + muzzleDog.getMuzzle().getColor());
        System.out.println("Muzzle's size: " + muzzleDog.getMuzzle().getSize());
        System.out.println("Muzzle's material: " + muzzleDog.getMuzzle().getMaterial());


        // Enum
        for (Planets element : Planets.values()) {
            System.out.println(element);
            System.out.println("Distance from Earth:" + " " + element.DistanceFromEarth());
        }
    }


}






