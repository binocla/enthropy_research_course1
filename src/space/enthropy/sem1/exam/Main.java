package space.enthropy.sem1.exam;

public class Main {

    public static void main(String[] args) {

    }
}


class Person {
    private String name; // null
    private int age; // 0

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void voice() {
        System.out.println("""
                Привет, меня зовут 
                """ + name + """
                 Мой возраст:
                """ + age);
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
        if (age > 100 || age < 0) {
            System.out.println("Нельзя");
            System.exit(0);
        }
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
}
