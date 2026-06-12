package by.Homework.lessons.HW5.animals;

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
}
