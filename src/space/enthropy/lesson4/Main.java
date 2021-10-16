package space.enthropy.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1) Scanner -> тип данных
        // 2) in -> название переменной
        // 3) = присваивание
        // 4) new Scanner(System.in) -> создание нового экземпляра класса (через конструктор)
        // Конструктор - специальный метод, название которого совпадает с названием класса и необходим для инициализации полей
        Person p = new Person("Sergey", "Shamov", 19, "binocla@vk.com");
        Person p1 = new Person("Sergey", "Shamov", 19);
        // Все классы в Java унаследованы от Object (!)
        System.out.println(p.email);
        System.out.println(p.toNormString()); // p.toString()
        System.out.println(p1.first_name);
        System.out.println(p1); // p1.toString()
        Animal animal = new Animal();
        Person p2 = new Person();
        System.out.println(p2);


    }
}
