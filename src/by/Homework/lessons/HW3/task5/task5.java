package by.Homework.lessons.HW3.task5;

import java.util.Scanner;

public class task5 {
    /*  Задачи 5
        Цикл for
        1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)
        2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
            (Используйте цикл while). Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.
        3*. Ввести число с консоли, которое не заканчивается на 0.Вывести число в обратном порядке. Использовать оператор %.
        4*. Ввести число с консоли, которое не заканчивается на 0.Вывести чётные и нечётные числа через while and if. Использовать оператор %.
        Задачи со звёздочкой необязательны к выполнению, но рекомендую попробовать сделать.
     */

    private final Scanner sc = new Scanner(System.in);

    public void printResultTask5() {   //есть ввод через консоль
        System.out.println("1. ");
        result1();
        System.out.println("********");

        System.out.println("2. ");
        result2();
        System.out.println("********");

        System.out.println("3. ");
        result3();
        System.out.println("********");

        System.out.println("4. ");
        result4();
    }

    private void result1() {
        System.out.println("Числа, кратные 7 или 3: ");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    private void result2() {
        System.out.println("Введите 2 положительных числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0, i = a + 1;

        if (a < 0 || b < 0) {
            System.out.println("Неверные числа");
            return;
        }

        //a и b не взял намеренно
        while (i < b) {
            sum += i;
            i++;
        }

        System.out.println("sum = " + sum);
    }

    private void result3() {
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int a = sc.nextInt();
        String result = "";

        if (a % 10 == 0) {
            System.out.println("Неверное число");
            return;
        }

        while (a != 0) {
            result += (a % 10);
            a /= 10;
        }

        System.out.println("result = " + result);
    }

    private void result4() {
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int a = sc.nextInt();
        String result1 = "Чет: ";
        String result2 = "Нечет: ";

        if (a % 10 == 0) {
            System.out.println("Неверное число");
            return;
        }

        while (a != 0) {
            if ((a%10)%2==0) result1 += a%10 + " ";
            else  result2 += a%10 + " ";

            a /= 10;
        }

        System.out.println(result1);
        System.out.println(result2);
    }
}
