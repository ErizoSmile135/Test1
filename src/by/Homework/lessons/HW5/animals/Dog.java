package by.Homework.lessons.HW5.animals;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private int midWeight;
    private String race;

    public Dog(String color, int maxLife, String typeFood, String name, int midWeight, String race) {
        super(color, maxLife, typeFood);
        this.name = name;
        this.midWeight = midWeight;
        this.race = race;
    }

    //Лаять
    @Override
    public void animalSound() {
        System.out.println(this.name + " лает");
    }

    //Кусать
    public void bite() {
        System.out.println(this.name + " кусает");
    }

    //Бегать
    public void run() {
        System.out.println(this.name + " бежит");
    }

    @Override
    public void animalGame() {
        System.out.println(this.name + " играет");
    }

    //Прыгать
    public void jump() {
        System.out.println(this.name + " прыгает");
    }

    @Override
    public String toString() {
        return this.name + " - собака. Параметры:\n" +
                "midWeight = " + this.midWeight + "\n" +
                "race = " + this.race + "\n" +
                "color = " + this.color + "\n" +
                "typeFood = " + this.typeFood + "\n" +
                "maxLife = " + this.maxLife;
    }

    @Override
    public int hashCode() {
        String hashString = this.name + " - собака. Параметры:" +
                            " midWeight = " + this.midWeight +
                            " race = " + this.race +
                            " color = " + this.color +
                            " typeFood = " + this.typeFood +
                            " maxLife = " + this.maxLife;
        return Objects.hash(hashString);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
