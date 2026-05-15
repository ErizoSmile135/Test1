package by.Homework.lessons.HW2;

import java.util.Scanner;

public class task4 {

    /*  1. На вход даны 3 числа. Вывести в консоль только четные числа
        2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
        (используйте оператор % для проверки деления без остатка)
        3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
        Написать программу, которая будет выводит разный текст, в зависимости от значения result.
        В случае result=3, вывести: "Результат деления равен 3"
        В случае result=5 вывести: "Результат деления равен 5"
        В других случаях вывести: "Результат деления равен дробному числу".
        При этом в последнем случае вывести точный результат деления (использовать приведение типов)
        Для выполнения задания использовать оператор switch- case

        Подготовить пул реквест в ветку master. Ссылку на пул реквест скидывайте мне в личку */

    private final Scanner sc = new Scanner(System.in);

    public void printResultTask4() {   //есть ввод через консоль
        System.out.println("1. ");
        result1();
        System.out.println("********");

        System.out.println("2. ");
        result2();
        System.out.println("********");

        System.out.println("3. ");
        result3();
    }

    private void result1() {
        System.out.println("Введите три числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Четные числа: " + (a % 2 == 0 ? a + " " : "") + (b % 2 == 0 ? b + " " : "") + (c % 2 == 0 ? c + " " : ""));
    }

    private void result2() {
        System.out.println("Введите три числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Числа делятся на 2 и на 5: " + ((a % 2 == 0 && a % 5 == 0) ? a + " " : "") + ((b % 2 == 0 && b % 5 == 0) ? b + " " : "") + ((c % 2 == 0 && c % 5 == 0) ? c + " " : ""));
        //ну или так
        //System.out.println("Числа делятся на 2 и на 5: " + (a % 10 == 0 ? a + " " : "") + (b % 10 == 0 ? b + " " : "") + (c % 10 == 0 ? c + " " : ""));
    }

    private void result3() {
        //как оказалось нужен jdk24 для float в switch
        int x = sc.nextInt();
        float result = (float) 15 / x;

        switch (result) {
            case ((float)3):
                System.out.println("Результат деления равен 3");
            case ((float)5):
                System.out.println("Результат деления равен 5");
            default:
                System.out.println("Результат деления равен дробному числу. result = " + result);
        }
    }
}
