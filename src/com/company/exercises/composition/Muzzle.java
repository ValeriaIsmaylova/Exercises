package com.company.exercises.composition;

public class Muzzle {
    private String color;
    private int size;
    private String material;

    public Muzzle(String color, int size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
