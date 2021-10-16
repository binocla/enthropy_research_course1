package space.enthropy.lesson4;

public class Person {
    String first_name; // Sergey
    String last_name; // Shamov
    int age; // 19
    String email; // binocla@vk.com
    // По умолчанию у всех наших классов (Scanner, String, Person) есть пустой конструктор
    // Пустой конструктор есть до тех пор, пока не создали хотя бы один свой.
    public Person(String first_name, String last_name,
                  int age, String email) { // конструктор
        this.first_name = first_name; // this. -> обращение к полю класса
        this.last_name = last_name;
        this.age = age;
        this.email = email;
    }
    public Person() {}

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }


    public String toNormString() {
        if (email == null) {
            email = "Нет почты";
        }
        return "Имя человека: " + first_name + " Фамилия: " + last_name + " Возраст: " + age + " Email: " + email;
    }


    @Override // Annotation.
    public String toString() { // Переопределение поведения метода toString() у Object
        if (email == null) {
            email = "Нет почты";
        }
        return "Имя человека: " + first_name + " Фамилия: " + last_name + " Возраст: " + age + " Email: " + email;
    }

}
