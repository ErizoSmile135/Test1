package by.Homework.lessons.HW5.animals;

import java.util.Objects;

public class Bird extends Animal {
    private String family;
    private int maxFly;

    public Bird(String color, int maxLife, String typeFood, String family, int maxFly) {
        super(color, maxLife, typeFood);
        this.family = family;
        this.maxFly = maxFly;
    }

    //Петь
    @Override
    public void animalSound() {
        System.out.println(this.family + " поет");
    }

    //Клевать
    public void bite() {
        System.out.println(this.family + " клюет");
    }

    //Высиживать
    public void hatchChicks() {
        System.out.println(this.family + " высиживает птенцов");
    }

    @Override
    public String toString() {
        return "Птица. Параметры:\n" +
                "family = " + this.family + "\n" +
                "maxFly = " + this.maxFly + "\n" +
                "color = " + this.color + "\n" +
                "typeFood = " + this.typeFood + "\n" +
                "maxLife = " + this.maxLife;
    }

    @Override
    public int hashCode() {
        String hashString = "Птица. Параметры:" +
                " family = " + this.family +
                " maxFly = " + this.maxFly +
                " color = " + this.color +
                " typeFood = " + this.typeFood +
                " maxLife = " + this.maxLife;
        return Objects.hash(hashString);
        //return Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        //Вопрос к реализации такого рода:
        /*      if (this.getClass() != obj.getClass()) return super.equals(obj);
                else return obj.hashCode() == this.hashCode();
         */
        //Почему я так написал. У меня сомнения что стоит сравнивать хэши при том, что они создаются по разному принципу
        //И я подумал сравнить сначала объекты, а к одному ли они классу относятся
        //Ведь если сделать Objects.hash ч точно такой же строкой в другом классе, они будут одинаковыми?

        return obj.hashCode() == this.hashCode();
    }
}
