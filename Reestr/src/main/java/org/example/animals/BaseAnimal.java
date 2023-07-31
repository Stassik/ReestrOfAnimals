package org.example.animals;

public abstract class BaseAnimal {
    public String name; // Имя животного
    public String mainClass; // Класс животного
    public String nameClass; // Подкласс животного
    public String birthday; // Дата рождения

    public String[] skills; // Умения

    public BaseAnimal (String name, String mainClass, String nameClass, String birthday, String[] skills) {
        this.name = name;
        this.mainClass = mainClass;
        this.nameClass = nameClass;
        this.birthday = birthday;
        this.skills = skills;
    }

    public String getInfo() {
        String str = mainClass + " " + nameClass + " " + name + " " + birthday + " " + String.join(" / ",skills);
        return str;
    }

}
