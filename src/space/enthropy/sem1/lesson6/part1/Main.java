package space.enthropy.sem1.lesson6.part1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        square.square(5); // 25.0, но не вывелось и ничего не увидели в качестве результата
        circle.square(5);
        System.out.println(circle.getSquare());
        System.out.println(square.getSquare()); // а вот тут уже получили и увидели результат строки 7
        rectangle.square(2, 3);
        System.out.println(rectangle.getSquare());

        ShapeOfRectangle shapeOfRectangle = new Rectangle();
        shapeOfRectangle.square(10, 2);

        System.out.println(shapeOfRectangle.getSquare());
        System.out.println(shapeOfRectangle.square);
    }
}
