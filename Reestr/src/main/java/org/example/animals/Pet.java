package org.example.animals;

public abstract class Pet extends BaseAnimal{

    public Pet(String name, String nameClass, String birthday, String[] skills) {
        super(name, "Домашние животные", nameClass, birthday, skills);
    }
}
