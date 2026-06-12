package by.Homework.lessons.HW5.animals;

public class Lion extends Animal {
    public Lion(String color, int maxLife, String typeFood) {
        super(color, maxLife, typeFood);
    }

    @Override
    public void animalSound() {
        System.out.println("Лев не волк, он по команде не лает");
    }

    @Override
    public void animalGame() {
        System.out.println("Лев не волк, он как в цирке не играет");
    }
}
