package by.Homework.lessons.HW2;

public class task3 {

    public void printResultTask3() {   //только вывод ответов в консоль
        System.out.println("1. " + result1());
        System.out.println("2. " + result2());
        System.out.println("3. " + result3());
        System.out.println("4. " + result4());
    }

    private int result1() {
        int x = (98 - 25) * 6;
        return x;
    }

    private String result2() {
        int x = 8, y = 9, z = 12;
        x += 5;
        y *= 9;
        z -= 6;
        String result = "x = " + x + ", y = " + y + ", z = " + z;
        return result;
    }

    private int result3() {
        int a = 35, b = 65;
        return a > b ? 5 : 10;
    }

    /* 4*. Даны значения: x=5; y=2; c=x*y; Расставьте операции инкремента декремента так,
     чтобы после выполнения операции (c=x*y) с равнялось 12, x=равнялось 6, y=1.
     Выведите полученные значения в консоль.
    */

    private String result4() {
        int x = 5, y = 2, c;
        c = ++x * y--;
        String result = "x = " + x + ", y = " + y + ", c = " + c;
        return result;
    }
}
