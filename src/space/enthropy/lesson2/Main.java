package space.enthropy.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x = 'я';

        String s = ""; // ссылочный тип данных
        // инициализация строк
        // 1)
        String s1 = "Hello World       "; // При инициализации строк используем ", не ' (для символов)
        String s0 = "Hello World";
        // все символы внутри " " считаются, соответственно пробелы тоже
        System.out.println(s1);

        // 2)
        String s2 = new String("Hello World");
        String s3 = new String("Hello World");
        System.out.println(s2 == s3); // false (сравниваем ссылки)
        System.out.println(s1 == s0); // true (сравниваем значения)
        // String pool заносятся строки из 1) способа. Сравнение через == сравнивает по значению (!)

        // Методы:
        // length() -> возвращает размер строки (длину строки)
        // charAt(int index) ~ ar[i] -> обращаемся к i-ой позиции строки и возвращает символ
        // contains(String str) -> возвращает true, если в строке исходной содержится строка переданная и false, если не содержится
        // substring(int start, int end) -> возвращает String (подстрока), начиная с start позиции, заканчивая end позицией
        // equals(String str) -> возвращает true если исходная строка совпадает с переданной (str), иначе false
        // trim() -> убирает лишние пробелы в конце строки ("Hello   ".trim() -> "Hello")
        // toLowerCase() -> перевести все символы строки в нижний регистр
        // toUpperCase() -> перевести все в верхний регистр
        System.out.println("Hello   ".length());
        System.out.println("Hello   ".trim());
        System.out.println("Hello   ".charAt(6));
        System.out.println("Hello   ".charAt(0));
        System.out.println("Hello   ".substring(2, 4).length());
        System.out.println("Hello   ".contains(" "));
        System.out.println("Hello   ".toUpperCase());
        System.out.println("Hello   ".toLowerCase());

        System.out.println(Arrays.toString("Hello World YEa aaSS Yea".split("aa")));
        // split -> по какой-то строке (delimiter -> regex) делить исходную строку на массив
        String[] arrayOfStrings = "Hello World YEa aaSS Yea".split(" ");
        String[] arrayOfStrings1 = "Hello  World   YEa aaSS    Yea".split("\\s+");
        System.out.println(Arrays.toString(arrayOfStrings1));
        System.out.println(Arrays.equals(arrayOfStrings, arrayOfStrings1)); // cheat
        System.out.println(arrayOfStrings.equals(arrayOfStrings1)); // false
        for (int i = 0; i < arrayOfStrings1.length; i++) {
            System.out.println(arrayOfStrings1[i]);
        }

        System.out.println("Hello".replace('l', 's'));
        System.out.println("H el l o Wo r ld".replaceAll(" ", ""));


        // String input = in.next(); // Считывает 1 слово (до пробела или отступа)
        String inputLine = in.nextLine(); // Считывает всю строку (включая пробелы и блаблабла)
        int sum = 0;
//        String[] array = inputLine.split(" ");
//        char ch = '5';
//        System.out.println(ch - '0'); // '5' -> 5 (int). -'0'
//        for (int i = 0; i < array.length; i++) {
//            sum += Integer.parseInt(array[i]); // Integer.parseInt -> берет целое число из строки "123" -> 123. Если будет не число в строке ("213f3") -> будет Exception
//        }
        System.out.println(sum);
        // indexOf | lastIndexOf (char) ->


    }
}
