package space.enthropy.lesson5;

public class Solution {
    // Абстракция -> стремление к обособлению от строгой реализации (Animal (abstract) -> cat / dog)
    // Наследование -> Свойство одного класса перенимать параметры другого (или это установление связи Родитель-Дочерний класс)
    // Для достижения наследования используется ключевое слово extends после названия класса

    // Вот тут мы рассмотрели пример Наследования (и полиморфизма, но что это такое - об этом позже)
    public static void main(String[] args) {
        Animal animal = new Animal("Jack", 2);
        System.out.println(animal);
        Cat cat = new Cat("Joy", 2, "Ball");
        Dog dog = new Dog("Michael", 13, 4);
        System.out.println(cat);
        System.out.println(dog);
        cat.voice();
        dog.voice();
        animal.voice();
        System.out.println(cat.getFullName());

        Animal an = new Cat("hoover", 20, "asd");
        Animal an1 = new Dog("qweqwe", 10);
        Animal an2 = new Cat();
        System.out.println("Animal 1");
        System.out.println(an.hashCode());
        System.out.println(an); // toString() используется дочернего класса (Cat)
        System.out.println(an.getName()); // Методы класса Cat недоступны, потому что обобщили. Левый тип данных > Правого типа данных
        System.out.println(an.getAge()); // Причем правый тип данных обязательное extends или implements левого
        System.out.println("Animal 2");
        System.out.println(an1); // toString метод из Object

        System.out.println(an1.getName());
        System.out.println(an1.getAge());
        System.out.println("Animal 3");
        System.out.println(an2);
        System.out.println(an2.getName());
        System.out.println(an2.getAge());
        // Произошло ограничение (обобщение) -> мы сказали, что обобщим класс Cat до методов и полей класса Animal
        // Восходящее преобразование (то есть Cat расширили до Animal. Таким образом потеряли функционал Cat)

    }
}

class Animal {
    public String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    @Override
    public String toString() { // Переопределяю toString Object'a
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int hashCode() {
        System.out.println("I am from Animal");
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public void voice() {
        System.out.println("I am Animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal {
    private String favouriteToy;

    public Cat(String name, int age, String favouriteToy) {
        super(name, age); // super(парам1, парам2...) -> передает в конструктор родителя name, age
//        super.setAge(100); // через super можно обращаться к методам
//        super.name = "qwewqe"; // можно к полям
        this.favouriteToy = favouriteToy;
    }

    public Cat() {

    }

    public Cat(String name, int age) {
        super(name, age);
    }

    // Object (toString1) -> Animal (toString2) -> Cat (toString3)
    @Override
    public String toString() { // Переопределяем toString Animal'a
        return "Имя: " + getName() + " возраст: " + getAge() + " любимая игрушка: " + favouriteToy;
    }


    @Override
    public int hashCode() {
        System.out.println("I am from Cat");
        return favouriteToy != null ? favouriteToy.hashCode() : 0;
    }

    @Override
    public void voice() {
        System.out.println("I am Animal Cat");
    }

    public String getFullName() {
        return super.getName() + " " + this.getFavouriteToy();
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

}

class Dog extends Animal {
    private int amountOfLegs; // по умолчанию 0 (то есть если не инициализировали через конструктор или сразу -> 0) 

    public Dog(String name, int age, int amountOfLegs) {
        super(name, age);
        this.amountOfLegs = amountOfLegs;
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getAge() + " количество лап: " + getAmountOfLegs();
    }

    @Override
    public void voice() {
        System.out.println("I am Animal Dog");
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }
}
