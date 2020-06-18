package com.company.exercises.encapsulation;

public class Pocket {

    private Integer money;

    public Pocket(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        if (money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    public void setMoney(Integer money) {
        if (money < 0) {
            System.out.println("Not enough money");
        }
        if (money > 3000) {
            System.out.println("I don’t have enough space in my pocket for as much money");
        } else {
            this.money = money;
        }

    }

}
