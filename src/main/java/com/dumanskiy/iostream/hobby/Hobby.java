package com.dumanskiy.iostream.hobby;

import java.io.Serializable;

public class Hobby implements Serializable {
    private String name;
    private int age;
    private int amount;

    public Hobby(String name, int age, int amount) {
        this.name = name;
        this.age = age;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amount=" + amount +
                '}';
    }
}
