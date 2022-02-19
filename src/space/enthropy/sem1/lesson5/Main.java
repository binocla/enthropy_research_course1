package space.enthropy.sem1.lesson5;

public class Main {
    // Инкапсуляция -> это один из важнейших принципов ООП, подразумевающий сокрытие реализаций методов или полей (с помощью модификатора private)
    // Плюсы инкапсуляции: наш код безопаснее, во-вторых появляется возможность осуществлять доп проверки (фильтрацию)
    public static void main(String[] args) {
        // 1 проблема -> возраст и имя могут испортиться
        Person p = new Person("Binocla", 19);
        Person1 p1 = new Person1("Binocla", 19, "qweqwe");
        // Getters:
//        p1.age();
//        p1.password();
//        p1.name();
        System.out.println(p1.name());
        System.out.println(p1);

        // p.age = 99999;
        // p.name = "qweqwkn214124123";
        p.setName("qweqweqwe");
        p.setAge(67);
        System.out.println(p);

    }
}

class Person {
    private String name;
    private int age;
    private String password;

    public Person(String name, int age) {
        if (age > 100 || age < 1) {
            System.out.println("I can't make a person");
            System.exit(0); // Завершить выполнение программы вообще
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Getter и Setter -> методы, позволяющие получать значение приватного поля (Getter) и менять его (Setter)
    // Getter

    public void setName(String name) {
        int cnt = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                cnt++;
            }
        }
        if (cnt > 0) {
            System.out.println("No, u can't");
            System.exit(0);
        }
        this.name = name;
    }


    public void setAge(int age) {
        if (age < 1 || age > 100) {
            System.out.println("No, u can't");
            System.exit(0);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

// Вариант как избежать boilerplate кода (getter, setter, tostring, equals, hashcode......)
// Java 14 --preview + (java 15, 16, 17)

record Person1(String name, int age, String password) { // record - это по сути тот же класс, но с уже заготовленными toString, getter...

    Person1 {
        if (age < 1 || age > 100) {
            System.out.println("No, u can't");
            System.exit(0);
        }
    }

    @Override
    public String name() {
        return name + " Hello, I am overrided";
    }
}
// Минусы - поля неизменяемые (immutable, final)


