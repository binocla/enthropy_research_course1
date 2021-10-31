package space.enthropy.lesson6.part2;

public class Rectangle implements ShapeOfRectangle {
    @Override
    public double square(int x, int y) {
        return x * y;
    }

    @Override
    public String toString() {
        return "I am Rectangle or realisation of interface!!!";
    }
    public void whoamI() {
        System.out.println("Rectangle");
    }
    // ...
}
