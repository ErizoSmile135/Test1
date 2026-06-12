package by.Homework.lessons.HW5.animals;

public class Animal {
    //protected для наследников, не видны другим потому что в своем пакете. Вроде норм. Наверное так я должен делать чтобы наследники могли получить эти поля, если без геттеров?
    protected String color;
    protected int maxLife;
    protected String typeFood;

    private int id;

    public Animal(String color, int maxLife, String typeFood) {
        this.color = color;
        this.maxLife = maxLife;
        this.typeFood = typeFood;
    }

    public void animalSound() {
        System.out.println("Животное издает звук");
    }

    public void animalGame() {
        System.out.println("Животное играет");
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
