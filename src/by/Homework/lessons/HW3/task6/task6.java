package by.Homework.lessons.HW3.task6;

public class task6 {
    /*  Задачи 6
        1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
            Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each.
        2. Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1 чем первый массив.
            Необходимо скопировать первый массив со всеми значениями во второй массив. Последний элемент во втором массиве пусть будет 0.
            Выведите второй массив в консоль с помощью цикла for each.
        3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива.
            Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
            Вывести полученный массив. Выполнить с помощью цикла for

        Задачи со звёздочкой необязательны к выполнению, но рекомендую попробовать сделать.
     */

    public void printResultTask6() {
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
        System.out.print("Дан массив: ");
        int[] arr = {4, 654, 36, 86, 7, 9, 5, 12, 0, 22};

        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println("Заменил чет индексы на 0: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) arr[i] = 0;
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();
    }

    private void result2() {
        System.out.print("Дан массив: ");
        int[] arr = {1, 2, 65, 8, 3};
        int[] arr2 = new int[arr.length + 1];

        for (int el : arr) {
            System.out.print(el + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = 0;

        System.out.println();
        System.out.print("Второй массив: ");
        for (int el : arr2) {
            System.out.print(el + " ");
        }

        System.out.println();
    }

    private void result3() {
        System.out.print("Дан массив: ");
        int[] arr = {4, 654, 36, 86, 7, 9, 5, 12, 0, 22};
        int idMax = 0, idMin = 0;

        for (int el : arr) {
            System.out.print(el + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[idMax]) idMax = i;
            if (arr[i] < arr[idMin]) idMin = i;
        }

        arr[idMax] = 1000;
        arr[idMin] = -1000;

        System.out.println();
        System.out.print("Второй массив: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();
    }

    private void result4() {
        System.out.print("Дан массив: ");
        int[] arr = {4, 654, 36, 86, 7, 9, 5, 12, 0, 22};

        for (int el : arr) {
            System.out.print(el + " ");
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1; k++) {
                int temp = arr[k + 1];
                arr[k + 1] = Math.max(arr[k + 1], arr[k]);
                arr[k] = Math.min(temp, arr[k]);
            }
        }

        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();
    }
}
