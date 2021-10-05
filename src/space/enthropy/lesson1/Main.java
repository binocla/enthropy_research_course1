package space.enthropy.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main { // public - доступ к классу может быть из любого места (из любой директории)
    public static void main(String[] args) {
        // public доступ к методу может быть из любого места (из любой директории)
        // static - узнаем позже
        // void - метод ничего не возвращает, любой другой тип данных - возвращает результат (int, boolean.... Scanner...)
        Scanner in = new Scanner(System.in);
        System.out.print("Hello"); // System - класс, out - поле, print - метод (принимает любое значение и выводит в консоль без отступа на след строку)
        System.out.println("World"); // System - класс, out - поле, print - метод (принимает любое значение и выводит в консоль с отступом на след строку)

        /* todo
            Примитивные и ссылочные типы данных
         */
        // 1) Init
        int helloWorld; // int - целое число. 4 байта. min = -2^31, max = 2^31-1
        helloWorld = 5;
        // 2) Init
        int cnt = 100;


        boolean flag = true; // boolean - true/false. 1 байт. min = 0. max = 1
        float c; // float - рациональные числа. 4 байта.
        double q; // double - рациональные числа. 8 байт
        long x; // long - целые числа. 8 байт. min= -2^63... max = 2^63-1
        short p; // short - целые числа. 2 byte. min - 2^15. max = 2^15-1
        char w; // char - символ. 2 byte. min = 0. max = 65535.
        byte z; // byte - число. min = -128, max = 127.
        int value = -2147483648 - 1; // 2147483647
        System.out.println(value);

        // Мы можем приводить один тип к другому:
        // 214748364722L -> рассматривай введенное мной число как Long
        // 2.125124128973912873D -> рассматривай как Double
        System.out.println((int) 21474836472L); // cast -> то есть мы явно сказали что хотим Long -> Integer
        System.out.println((int) 2.52); // cast int к double -> возвращает целую часть double
        // System.out.println((boolean) 123); // мы не можем привести boolean -> int
        double doub = 5;
        int qwe = (int) 5.23;
        System.out.println(5 / 2);
        System.out.println(5.0 / 2.0);
        double del = (double) 5 / 2;
        double del1 = 5.0 / 2.0;
        double del2 = 5D / 2D;
        System.out.println(del);
        System.out.println(0.0 / 0.0);// NaN
        System.out.println(1.0 / 0.0);// Infinity
        // System.out.println(1 / 0);// ArithmeticException

        // Stack - хранит примитивы (и только их). Мы не имеем доступа к Stack. Аналогия - оперативка компа. Места мало, скорость выше.
        // Heap - хранит ссылочные типы данных. Аналогия - жесткий диск. Места много, скорость меньше

        // Арифметические операции: + - * / %
        // / - делить нацело. 5 / 2 = 2
        // % - делить с остатком. 5 % 2 = 1. 10 % 10 = 0. 4 % 20 = 4. 4 % 0 -> Exception. 0 % 4 -> 0. 3 % -2 -> positive. -3 % 2 -> negative
        System.out.println("Hello World");
        System.out.println("Hello" + " " + "World"); // Конкатенация строк
        // Операнды.
        /*
            1) >
            2) <
            3) >=
            4) <=
            5) == (equals - ссылочные типы данных)
            6) !=
            7) >> // все что ниже - побитовые сдвиги
            8) >>>
            9) <<
            10) <<<
            11) !>>
            12) ^ // Xor исключающая или
            13) & // Без контекста логическое (в дискре) И, а в контексте if - логическое И
            14) | // Без контекста логическое (в дискре) ИЛИ, а в контексте if - логическое ИЛИ
            15) || // логическое ИЛИ (lazy)
            16) && // логическое И (lazy)
         */
        if (helloWorld > 10 || cnt % 2 != 0) { // Если по ходу обработки условий (слева направо) есть хотя бы ОДИН true - Дальше джава условие не рассматривает
            System.out.println("blabla");
        } else if (helloWorld == 5) {
            System.out.println("y");
        } else {
            System.out.println("x");
        }


        System.out.println(5 ^ 7);
        // 5 -> 101
        // 7 -> 111

        // psvm + Enter или + Tab -> public static void main
        // Ctrl + D -> дублирование текущей строки
        // fori + Enter или + tab -> for (int i = 0; i < ; i++)
        // sout + Enter или + Tab -> System.out.println();

//        while (true) {
//            if (cnt % 2 != 0) {
//                cnt -= 2; // cnt = cnt - 2;
//                continue;
//            }
//            System.out.println(cnt);
//            cnt = cnt - 1;
//            if (cnt == 1) {
//                break;
//            }
//        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("hi");
        }
        for (int i = 10; i < 100; i += 2) {
            if (i >= 12 && i <= 27) {
                System.out.println(i);
            }
        }
        for (int i = 12; i <= 27; i += 2) {
            System.out.println(i);
        }


        // Постфиксный и префиксный инкремент и декремент: cnt++, ++cnt, --cnt, cnt--;
        // cnt++ -> cnt = cnt + 1;
        // ++cnt -> cnt = 1 + cnt;
        // ключевые слова break и continue.
        // break и continue используются в условиях (if)
        // break - прерывает выполнение цикла (выходит из него совсем). Из того, в котором находится
        // continue - пропускает текущую итерацию цикла и переходит к следующей (то есть код ниже скипается)

        // Что такое массив?
        // Массив - набор однотипных данных
        // 1) Init
        int size;
        size = 10;
        int[] ar = new int[size]; // массив - ссылочный тип данных!!!!!!! 5 -> размер массива (const)
        // int, short, long, byte -> 0
        // double, float -> 0.0
        // boolean -> false
        // char -> 0 (from Unicode)
        // у ссылочных -> null
        ar[2] = 6;
        // ar[10] = 11; // IndexOfOutRange
        // ar[-1] = 11; // IndexOfOutRange
        int[][] bla = new int[2][]; // можно
        int[][] bla1 = new int[2][6]; // можно (эталон)
        int[] bla2[] = new int[2][6]; // можно
        int bla3[][] = new int[2][6]; // можно
        // int[][] bla1 = new int[][6]; // нельзя
        // int[] mas = new int[-10]; // есть, но с исключением
        int[] mas2 = new int[0]; // есть, но пустой []
        System.out.println(Arrays.toString(mas2));
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(ar));
        // Scanner -> класс, который позволяет считывать из любого места (System.in) -> с клавиатуры данные
        // основные методы Scanner:
        // in.next() -> Рассматривает считанные данные в качестве String (до пробела или отступа) -> одно слово
        // in.nextInt() -> Рассматривает считанные данные в качестве int
        // in.nextDouble() -> Рассматривает считанные данные в качестве double
        // ...
        // in.nextLine() -> Рассматривает считанные данные в качестве String (всю строку включая пробелы и прочее)
        // in.nextChar() ? -> не существует. in.next().charAt(0) -> считывает один символ

        // int[] a = new int[]

        // 2) Init
        int[] xx = new int[]{2, in.nextInt(), in.nextInt()}; // подходит в основном для тестирования (когда заранее задаются какие-либо значения)
        System.out.println(xx.length); // 3

        // todo Важный момент
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = array1.clone(); // clone -> клонирует (то есть выделяет с точно такими же значениями другую ячейку памяти)
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        // Если array2 = array1 (копируем ссылку). Соответственно, если поменяем что-то в одном - во всех других массивах это тоже изменится
        array2[0] = 100;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
}
