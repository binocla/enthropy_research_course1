package space.enthropy.sem2.lesson4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class PersonClass {
    private final int age;
    private final String name;
    private final String gender;

    public PersonClass(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public static List<PersonClass> sort(List<PersonClass> people) {
        List<PersonClass> sortByAge = people.stream().
                sorted(Comparator.comparing(PersonClass::getAge).//??
                        thenComparing(PersonClass::getGender).//??
                        thenComparing(PersonClass::getName)).// ??
                        collect(Collectors.toList());
        return sortByAge;
    }

    public static Map<String, List<PersonClass>> groupByGender(List<PersonClass> people) {
        return people.stream()
                .collect(Collectors.groupingBy(PersonClass::getGender));

    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class FS1 {
    public static void main(String[] args) {
        PersonClass p1 = new PersonClass(18, "Александр", "М");
        PersonClass p2 = new PersonClass(23, "Маша", "Ж");
        PersonClass p3 = new PersonClass(7, "Миша", "М");
        PersonClass p4 = new PersonClass(50, "Лиза", "Ж");
        PersonClass p5 = new PersonClass(39, "Ваня", "М");
        List<PersonClass> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        System.out.println(PersonClass.sort(people));
        System.out.println(PersonClass.groupByGender(people));

    }
}
