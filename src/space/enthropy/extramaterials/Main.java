package space.enthropy.extramaterials;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(null, 19);
        Person p2 = new Person(null, 19);
        System.out.println(p1.equals(p1));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // Тут this обозначает текущий экземпляр
        // Тут сравниваются ссылки, потому что p1.equals(p1) -> p1 один и тот же (значит ссылки равны)
        if (this == o) { // Если объект, с которым мы сравниваем тот же самый, тогда сразу true
            // p1.equals(p1);
            return true;
        }
        if (o == null || getClass() != o.getClass()) { //getClass() -> возвращает класс объекта
            // getClass() -> Person
            // o.getClass() -> объект, который пришел на сравнение
            // Принцип SOLID (Liskov substitution). Принцип подстановки Барбары-Лисков
            // В методе equals всегда нарушается какой-то принцип:
            // Если используем getClass -> Liskov principle
            // Если instanceof -> транзитивность, коммутативность...
            // Если null -> сразу false
            return false;
        }

        Person person = (Person) o; // Когда мы удостоверились, что
        // 1) Мы не сравниваем объект с самим собой
        // 2) Мы не получили на сравнение null
        // 3) Мы не сравниваем Person и Капибару/Самолет/Телефон...
        // Тогда нисходящее преобразование (то есть Object -> Person)

        if (age != person.age) { // Примитивы сравниваются быстрее ссылочных типов данных
            // Если возраст не равен -> false
            return false;
        }
        if (name != null) { // Сначала проверяем что имя не null
            // Сравниваем имена
            // У null нельзя вызывать методы, но сравнивать с null можно
            return name.equals(person.name); // Здесь equals не здешний, а у строк ("Hello".equals("blabla")
        }
        return person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
