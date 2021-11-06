package space.enthropy.lesson7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CitiesExecutor {
    public static void main(String[] args) {
        Cities city = Cities.LONDON;
        city.setCode(1);
        city.setRegion("Changed");
        // Enum -> специальный класс, перечисляемый тип данных (константы).
        // Полезен для тестирования/каких-то глобальных данных
        System.out.println(city.name());
        // city.name() то же самое, что и toString() (если мы не изменили текст вывода toString())
        System.out.println(city.ordinal());
       // System.out.println(city);

        // Задача 1: вывести все enum'ы
        // Cities.values() возвращает Cities[]
        for (int i = 0; i < Cities.values().length; i++) {
            System.out.println(Cities.values()[i]);
        }
        // Задача 2: По входной строке вывести enum
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Введите название города
                """);
        String s = in.next().toUpperCase();
        System.out.println(Cities.valueOf(s)); // Cities.valueOf(...) -> возвращает enum

        System.out.println(Months.valueOf("Март"));
        System.out.println(Arrays.toString(Months.values()));


    }
}
