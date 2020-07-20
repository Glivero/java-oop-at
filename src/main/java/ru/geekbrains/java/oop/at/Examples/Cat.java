package ru.geekbrains.java.oop.at.Examples;

public class Cat {
    String name;

    public void eat(CatFood catFood){
        System.out.println(name + " кушает " + catFood.getProductName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
