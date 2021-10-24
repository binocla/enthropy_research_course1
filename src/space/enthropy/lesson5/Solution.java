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

    }
}

class Animal {
    private String name;
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
        this.favouriteToy = favouriteToy;
    }

    // Object (toString1) -> Animal (toString2) -> Cat (toString3)
    @Override
    public String toString() { // Переопределяем toString Animal'a
        return "Имя: " + getName() + " возраст: " + getAge() + " любимая игрушка: " + favouriteToy;
    }

    @Override
    public void voice() {
        System.out.println("I am Animal Cat");
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

}

class Dog extends Animal {
    private int amountOfLegs;

    public Dog(String name, int age, int amountOfLegs) {
        super(name, age);
        this.amountOfLegs = amountOfLegs;
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
