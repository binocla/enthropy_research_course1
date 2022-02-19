package space.enthropy.sem1.lesson6.part2;

// Если хотим задействовать интерфейс - пишем вместо extends -> implements
public class Circle implements ShapeOfCircleAndSquare {
    @Override
    public double square(int x) {
//       value = 100; // НЕЛЬЗЯ! потому что value -> final
        return Math.PI * x * x;
    }

    @Override
    public double hiIAmDefault() { // Переопределил default метод в интерфейсе (потому что просто не хочу возврат 123)
        return value * 100; // возвращает 200
    }
}
