package ru.geekbrains.java.oop.at.Examples.example1;

public class Start {
    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.name ="Kitti Cat";
        Cat cat = new Cat();
        cat.eat(catFood);
    }
}
