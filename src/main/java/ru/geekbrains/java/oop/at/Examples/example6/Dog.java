package ru.geekbrains.java.oop.at.Examples.example6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void barking(){
        System.out.println(name+" гавкает");
    }
}
