package space.enthropy.sem2.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {





        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(list.size() - 1);
        System.out.println(list);
        Person p1 = Person.generatePerson();
        Person p2 = Person.generatePerson();
        Person p3 = Person.generatePerson();
        Person p4 = Person.generatePerson();
        Person p5 = Person.generatePerson();
        Person p6 = new Person("Binocla", 19);
        Person p7 = new Person("Binocla", 19);
        HashMap<Person, Integer> map = new HashMap<>();
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);
        map.put(p5, 5);
        map.put(p6, 6);
        map.put(p7, 7);
        for (Map.Entry<Person, Integer> q : map.entrySet()) { // 1 способ вывода ключа + значения
            System.out.println(q.getKey());
            System.out.println(q.getValue());
        }

        for (int i = 0; i < map.keySet().toArray().length; i++) { // 2 способ вывода
            System.out.println(map.keySet().toArray()[i]
                    + " " + map.get(map.keySet().toArray()[i]));
        }
        System.out.println(map);


    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public static Person generatePerson() {
        return new Person(UUID.randomUUID().toString(), new Random().nextInt(0, 100));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (o.age > age) {
            return -1;
        } else if (o.age < age) {
            return 1;
        } else {
            return 0;
        }
    }
}
