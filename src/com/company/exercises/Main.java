package com.company.exercises;

import com.company.exercises.encapsulation.Dog;
import com.company.exercises.inheritance.*;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("King", 5, "male", "dalmatian", 50);
        System.out.println(dog.getAge());

        Dog dog1 = new Dog();
        System.out.println(dog1.getRace());

        Circle  circle = new Circle();
        Rectangle rectangle = new Rectangle();



        Animal [] box = new Animal [] {new DogB(), new Cat()};

            for (int i = 0; i < box.length; i++)
                box[i].yieldVoice();


        }


    }


