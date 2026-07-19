package by.Homework.lessons.HW9;

import by.Homework.lessons.HW9.task17.Task17;
import by.Homework.lessons.HW9.task18.Task18;
import by.Homework.lessons.HW9.task19.City;
import by.Homework.lessons.HW9.task19.Continent;
import by.Homework.lessons.HW9.task19.StringCaps;
import by.Homework.lessons.HW9.task20.FileCreator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass  {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        //task17();
        //task18();
        //task19();
        task20();
        task21();
    }

    static void task17(){
        Task17 task17 = new Task17();

        task17.writeRelativePath();
        task17.writeAbsolutePath();
        task17.readRelativeFile();      //!!! ошибка
        task17.readAbsoluteFile();      //!!! ошибка

        //2
        by.Homework.lessons.HW9.task17.Car car = new by.Homework.lessons.HW9.task17.Car("Car1", 100, "Country");
        task17.serializeCar(car);
        task17.deserializeCar();
    }

    static void task18(){
        Task18 task18 = new Task18();
        //Не уверен в таком решении подхода к классам в разных пакетах, но другого не знаю пока
        by.Homework.lessons.HW9.task18.Car car1 = new by.Homework.lessons.HW9.task18.Car("name1", "number1", 1000);
        by.Homework.lessons.HW9.task18.Car car2 = new by.Homework.lessons.HW9.task18.Car("name2", "number2", 3000);
        by.Homework.lessons.HW9.task18.Car car3 = new by.Homework.lessons.HW9.task18.Car("name3", "number3", 2000);

        //1-1.2
        /*car1.start();
        car2.start();*/

        //1.3
        /*car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        car2.start();
        car3.start();*/

        //1.4
        by.Homework.lessons.HW9.task18.runnable.Car carR1 = new by.Homework.lessons.HW9.task18.runnable.Car("name1", "number1", 1000);
        by.Homework.lessons.HW9.task18.runnable.Car carR2 = new by.Homework.lessons.HW9.task18.runnable.Car("name2", "number2", 3000);

        Thread thread1 = new Thread(carR1);
        Thread thread2 = new Thread(carR2);

        thread1.start();
        thread2.start();

    }

    static void task19(){
        //1
        StringCaps toUpperCase = str -> str.toUpperCase();      //String::toUpperCase но я еще не привык так писать
        System.out.println(toUpperCase.toUp("string test"));

        //2
        City city1 = new City(1, "City1", 100, Continent.EUROPE);
        City city2 = new City(2, "City2", 200, Continent.EUROPE);
        City city3 = new City(3, "City3", 5, Continent.ASIA);
        City city4 = new City(4, "City4", 9999999, Continent.ASIA);
        City city5 = new City(5, "City5", 155, Continent.AFRICA);
        City city6 = new City(6, "City6", 10000000, Continent.ASIA);

        List<City> cities = List.of(city1, city2, city3, city4, city5, city6);

        //2.2
        System.out.println("2.2 - " + cities.stream()
                        .filter(city -> city.getContinent() == Continent.ASIA)
                        .max(Comparator.comparing(City::getPopulation))
                        .get()
                        .getName()
        );

        //2.3
        System.out.println("2.3 - " + cities.stream()
                        .filter(city -> city.getContinent() == Continent.ASIA)
                        .min(Comparator.comparing(City::getPopulation))
                        .get()
                        .getName()
        );

        //2.4
        System.out.println("2.4 - " + cities.stream()
                        .max(Comparator.comparing(City::getPopulation))
                        .get()
                        .getName()
        );

        //2.5
        System.out.println("2.5 - " + cities.stream()
                        .min(Comparator.comparing(City::getPopulation))
                        .get()
                        .getName()
        );

        //2.6
        System.out.println("2.6 - " + cities.stream()
                        .filter(city -> city.getPopulation() > 1000000)
                        .findFirst()
                        .get()
                        .getName()
        );

        //2.7
        cities.stream()
                .filter(city -> city.getPopulation() > 1000000)
                .forEach(city -> System.out.println("2.7 (" + city.getId() + ") - " + city.getName()));

        //2.8
        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();

        System.out.println("2.8 - " + cityNames);
    }

    static void task20() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        //подсмотрел в интернете что не обязательно по десять строк писать)
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(service.submit(new FileCreator()));
        }

        for (Future<List<String>> future : futures) {
            System.out.println(future.get());
        }

        service.shutdown();
    }

    static void task21(){

    }
}
