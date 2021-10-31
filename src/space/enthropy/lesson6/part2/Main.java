package space.enthropy.lesson6.part2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        Square square = new Square();
        System.out.println(square.square(5)); // то же самое, что и на строке 9
        System.out.println(square.hiIAmDefault()); // 123, потому что метод интерфейса я НЕ переопределил. По умолчанию он возвращает 123

        ShapeOfCircleAndSquare shapeOfCircleAndSquare = new Circle();
        System.out.println(shapeOfCircleAndSquare.square(5)); // то же самое, что и на строке 7

        System.out.println(square.hiIAmDefault());
        System.out.println(circle.square(5));
        System.out.println(circle.hiIAmDefault()); // 200, потому что метод интерфейса я ПЕРЕОПРЕДЕЛИЛ
        Rectangle rectangle = new Rectangle();
        rectangle.whoamI();

        ShapeOfRectangle shapeOfRectangle = new Rectangle(); // Я говорю, что мой интерфейс реализуется классом справа
        // только если класс справа имплементирует интерфейс слева
        System.out.println(shapeOfRectangle.square(1, 5));
        // shapeOfRectangle это интерфейс. Конструктора нет! Мы обязаны полностью проинициализировать интерфейс, выбрав для него реализацию (то есть указав справа класс, который implements данный интерфейс)
        //
        System.out.println(shapeOfRectangle.square(2, 10)); // она не в курсе, что мы выбрали реализацию для интерфейса

    }
}
