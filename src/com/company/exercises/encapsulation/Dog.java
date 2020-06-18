package com.company.exercises.encapsulation;

public class Dog {
    private String name;
    private Integer age;
    private String gender;
    private String race;
    private Integer weight;

    public Dog(String name, Integer age, String gender, String race, Integer weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog() {
        this.gender = gender;
        this.race = race;

    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 15) {
            System.out.println("Old dog");
        } else {
            this.age = age;
        }
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight <= 0) {
            System.out.println("Error");
        } else {
            this.weight = weight;

        }

    }
}