package space.enthropy.lesson7;

public class AnonimClass {
    public static void main(String[] args) {
        Calculator c = new Calculator() { // Пример анонимного класса (анонимная реализация интерфейса/абстрактный класс)
            @Override
            public int sum(int x, int y) {
                return x + y;
            }
        };
        Database database = new Database() {
            @Override
            public void hello() {
                System.out.println("Haha, I am overriden");
            }
        };
        database.hello();
        database.hello();
        database.hello();
        database.hello();
        database = new Database();
        database.hello();
        database.hello();

        System.out.println(c.sum(2, 5));
    }
}

interface Calculator {
    int sum(int x, int y);
}

class Database {
    public void hello() {
        System.out.println("Hello");
    }
}
