package by.Homework.lessons.HW9.task17;

import java.io.*;

public class Task17 {
    private final String exmpText = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";
    private File fileAbs = new File("C:\\Users\\maxya\\IdeaProjects\\Test1\\src\\by\\Homework\\lessons\\HW9\\task17\\absolute.txt");
    private File fileRel = new File("src\\by\\Homework\\lessons\\HW9\\task17", "relative.txt");

    //1.1 Запись через относительный путь
    public void writeRelativePath() {
        try (FileWriter writer = new FileWriter(fileRel)) {
            writer.write(exmpText);
            System.out.println("relative.txt - done");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    // 1.2 Запись через абсолютный путь
    public void writeAbsolutePath() {
        try (FileWriter writer = new FileWriter(fileAbs)) {
            writer.write(exmpText);
            System.out.println("absolute.txt - done");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    // 1.3 Чтение первого файла
    public void readRelativeFile() {
        try (FileReader fileReader = new FileReader(fileRel)) {
            //System.out.println(fileReader.readAllAsString());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    // 1.4 Чтение второго файла
    public void readAbsoluteFile() {
        try (FileReader fileReader = new FileReader(fileAbs)) {
            //System.out.println(fileReader.readAllAsString());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void serializeCar(Car car) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\by\\Homework\\lessons\\HW9\\task17\\car.txt"))) {
            output.writeObject(car);
            System.out.println("serializeCar - done");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deserializeCar() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("src\\by\\Homework\\lessons\\HW9\\task17\\car.txt"))) {
            Car car = (Car) input.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}


/*  Домашнее задание №17
    Гербер Шилдт. Полное руководство. Java 12 -ое издание. Страницы: с 367-401, 813-868
    Дан текст: The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.
    1.1 Записать его в файл,  прописав относительный путь. Реализуйте соответствующий метод в классе Main.
    1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
    1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
    1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main
    2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
        Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).
        В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
    2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main

    Сроки выполнения 12.07.2026 Ссылку на пул реквест бросать мне в личку в телеграмме
    Вопросы для проработки:
    1. Назовите основные классы для потоков ввода и вывода
    2. Чем отличаются ключевые слова final, finally, finalize?
    3. Что такое сериализация?
    4. Ключевое слово transient, что обозначает?
    5. Назовите основные классы для чтения  записи текста в файл.
    6. Что такое try c ресурсами?
 */