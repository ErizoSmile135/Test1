package by.Homework.lessons.HW5;

import by.Homework.lessons.HW5.animals.Animal;
import by.Homework.lessons.HW5.animals.Bird;
import by.Homework.lessons.HW5.animals.Dog;
import by.Homework.lessons.HW5.animals.Lion;

public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Red", 25, "Meet", "Dan", 33, "Good Dog");
        Bird bird = new Bird("Blue", 14, "Plants", "Big Bird", 4000);

        System.out.println("Dog can:");
        dog.animalSound();
        dog.animalGame();
        dog.bite();
        dog.run();
        dog.jump();

        System.out.println("***************");
        System.out.println("Bird can:");
        bird.hatchChicks();
        bird.bite();
        bird.animalSound();
        //bird.animalGame();    //в теории тоже может, раз наследует. Но не переопределял (видимо для примера в будущем...)

        System.out.println("\n******* Параметры *******");
        System.out.println(dog);
        System.out.println("**************");
        System.out.println(bird);

        System.out.println("\n////////ZOO////////");
        Zoo zoo = new Zoo(new Animal[0]);
        Dog dog2 = new Dog("Pink", 25, "Meet", "Scott", 33, "Bad Dog");
        Bird bird2 = new Bird("Green", 14, "Plants", "Typic Bird", 4000);
        Dog dog3 = new Dog("Black", 25, "Meet", "Aurelia", 33, "Typic Dog");
        Bird bird3 = new Bird("Yellow", 14, "Plants", "Small Bird", 4000);

        zoo.addAnimal(dog);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        zoo.addAnimal(bird);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        for (Animal animal : zoo.getAnimals()) {
            System.out.println("/*/*/*/\nAnimal - " + animal.getId());
            animal.animalSound();
            animal.animalGame();
        }

        //ЛЕВ
        System.out.println("\n////////Львы////////");
        Lion lion1 = new Lion("Yellow", 99, "MEET");
        Lion lion2 = new Lion("Red", 99, "MEET");
        System.out.println("LION - 1");
        lion1.animalGame();
        lion1.animalSound();
        System.out.println("LION - 2");
        lion2.animalGame();
        lion2.animalSound();

        Lion lion3 = new Lion("Orange", 99, "MEET");
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);
        System.out.println("******** ZOO with LION *******");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println("/*/*/*/\nAnimal - " + animal.getId());
            animal.animalSound();
            animal.animalGame();
        }

        //ID
        System.out.println("\n//////// ALL ZOO ////////");
        zoo.getAllInfo();   //Для львов toString не переопределен. Задачи такой нет, значит оставлю так как пример "что если не менять". Но переопределять умею, честно

        for (Animal animal: zoo.getAnimals()){
            if (animal.getId()%2 == 0) zoo.removeAnimal(animal.getId());
        }

        System.out.println("\n******** ZOO нечетные *******");
        for (Animal animal : zoo.getAnimals()) {
            System.out.println("/*/*/*/\nAnimal - " + animal.getId());
            animal.animalSound();
            animal.animalGame();
        }
    }
}
