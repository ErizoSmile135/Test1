package by.Homework.lessons.HW5;

import by.Homework.lessons.HW5.animals.Animal;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimalArr = new Animal[this.animals.length + 1];

        //Ставлю id на 1 больше последней записи... Вообще тут можно было что-то типа SEQUENCE из оракла. Но не хочу так мудрить
        if (this.animals.length != 0) animal.setId(this.animals[this.animals.length - 1].getId() + 1);
        else animal.setId(1);

        for (int i = 0; i < animals.length; i++) {
            newAnimalArr[i] = this.animals[i];
        }

        newAnimalArr[animals.length] = animal;
        this.animals = newAnimalArr;
    }

    public Animal[] getAnimals() {
        return this.animals;
    }

    public void getAllInfo() {
        for (Animal animal : this.animals) {
            System.out.println("****\nAnimal №" + animal.getId());
            System.out.println(animal);
        }
    }

    public void removeAnimal(int id) {
        Animal[] newAnimalArr = new Animal[this.animals.length - 1];

        for (int i = 0, k = 0; i < newAnimalArr.length; i++, k++) {
            while (this.animals[k].getId() == id) k++;      //Как бы if нужно, id ведь не должны повторятся. Но и id тут реализован кое-как
            newAnimalArr[i] = this.animals[k];
        }

        this.animals = newAnimalArr;
    }
}
