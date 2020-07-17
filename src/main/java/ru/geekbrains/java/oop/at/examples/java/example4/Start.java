package ru.geekbrains.java.oop.at.examples.java.example4;

public class Start {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Лорд");
        dog.barking();

        Cat cat = new Cat();
        cat.setName("Том");
        cat.meows();
    }
}
