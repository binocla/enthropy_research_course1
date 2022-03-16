package space.enthropy.sem2.lesson5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1
        /*
            Есть класс Human
            Поля: String name, int age, Music type

            Music - класс. Поля: String name, double duration.

            Необходимо сохранить массив Human[] в Set используя Stream API,
                причем сохранять только Human, чей age четный

            P.S. осуществлять проверки на age и duration (age >=1 <=100), (duration >=0.0)

         */
    }
}

class Task1 {
    public static void main(String[] args) {
        Human[] humans = {Factory.generate(), Factory.generate(), Factory.generate(),
                Factory.generate(), Factory.generate(), Factory.generate(), Factory.generate()};
        HashSet<Human> set = Arrays.stream(humans).filter(x -> x.getAge() % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);
    }
}

class Factory {
    public static Human generate() {
        return new Human(UUID.randomUUID().toString(),
                new Random().nextInt(-10, 150),
                new Music(UUID.randomUUID().toString(),
                        new Random().nextDouble(-10, 50)));
    }
}

class Human {
    private String name;
    private int age;
    private Music type;

    public Human(String name, int age, Music type) {
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("Invalid values");
        }
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    public int getAge() {
        return age;
    }
}

class Music {
    private String name;
    private double duration;

    public Music(String name, double duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Invalid values");
        }
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
