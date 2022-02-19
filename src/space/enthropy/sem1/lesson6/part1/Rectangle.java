package space.enthropy.sem1.lesson6.part1;

public class Rectangle extends ShapeOfRectangle {

    @Override
    public void square(int x, int y) {
        super.square = x * y;
    }

    public void whoamI() {
        System.out.println("I am rectangle");
    }
}
