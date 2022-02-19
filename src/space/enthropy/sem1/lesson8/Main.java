package space.enthropy.sem1.lesson8;

public class Main {
    public static void main(String[] args) {
        // SOLID
        Pig p = new Pig("pig");
        Dog d = new Dog("dog");
        Animal[] an = {p, d};
        // Про Лисков:
        // Не должно быть getClass || instanceOf
        for (int i = 0; i < an.length; i++) {
            an[i].voice();
        }

    }
}

abstract class Database {
    abstract void save();
    abstract void add();
    abstract int get();
    abstract void update();
    abstract void delete();
    abstract int factorial(); // transfer this method to class Factorial
}


class Animal {
    public String name;

    public void voice() {
        System.out.println("I am animal");
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Pig extends Animal {

    public Pig(String name) {
        super(name);
    }
    @Override
    public void voice() {
        System.out.println("I am pig");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void voice() {
        System.out.println("I am dog");
    }
}

interface Purchase {
    void addToCart();

}
interface PersonWalk {
    void walk();
}

class Person implements PersonWalk {

    @Override
    public void walk() {

    }
}
class InternetShop implements Purchase {

    @Override
    public void addToCart() {

    }
}


