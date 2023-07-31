package org.example;

import org.example.animals.BaseAnimal;
import org.example.animals.PackAnimals.Camels;
import org.example.animals.PackAnimals.Donkeys;
import org.example.animals.PackAnimals.Horses;
import org.example.animals.Pets.Cats;
import org.example.animals.Pets.Dogs;
import org.example.animals.Pets.Hamsters;

import java.util.ArrayList;

public class Main {

    public static ArrayList<BaseAnimal> animalList = new ArrayList<>();
    public static void main(String[] args) {
        animalList.add(new Dogs("Гера", "2019-03-27", new String[]{"Лежать", "Кусать", "Бегать"}));
        animalList.add(new Cats("Люся", "2015-05-17", new String[]{"Лежать", "Играть"}));
        animalList.add(new Cats("Пушок", "2020-10-02", new String[]{"Лежать"}));
        animalList.add(new Hamsters("Грызлик", "2010-11-18", new String[]{"Бегать в колесе"}));
        animalList.add(new Horses("Пуля", "2019-03-27", new String[]{"Скакать", "Перепрыгивать"}));
        animalList.add(new Camels("Рыжик", "2015-05-17", new String[]{"Сидеть", "Играть"}));
        animalList.add(new Camels("Двугорбик", "2020-10-02", new String[]{"Бегать", "Лежать"}));
        animalList.add(new Donkeys("Иа", "2010-11-18", new String[]{"Катать"}));

        for (BaseAnimal unit: animalList) {
            System.out.println(unit.getInfo());
        }

        System.out.println("Реестр животных");
        System.out.println("Что Вы хотите сделать?\n1 - просмотреть список животных;\n2 - добавить животное;\n3 - найти животное\n0 - выйти.\"");


    }
}