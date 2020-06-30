package com.company.exercises.enums;

public enum Planets {

    //Create enum Planets
    VENUS("Venus", "Huge", 8.45),
    SATURN("Saturn", "Huge", 5.45),
    MARS("Mars", "Small", 4.34),
    EARTH("Earth", "Small", 0),
    JUPITER("Jupiter", "Huge", 9.37),
    NEPTUNE("Neptune", "Small", 4.39);

    private String name;
    private String size;
    private double distanceFromEarth;

    Planets(String name, String size, double distanceFromEarth) {
        this.name = name;
        this.size = size;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }


    // Override toString method. It should print relative size of a planet and it’s name.
    // E.g. „Huge Jupiter”, „Small Pluto”.

    @Override
    public String toString() {
        return getSize() + " " + getName();
    }


    //Create distanceFromEarth method

    public double DistanceFromEarth() {
        return distanceFromEarth;
    }
}

