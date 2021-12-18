package space.enthropy.lesson10;

public class Main {
    public static void main(String[] args) {
        System.out.println(res());
    }

    public static int res() {
        try {
            System.out.println(1 / 0);
            return 2;
        } catch (ArithmeticException e) {
            return 5;
        } finally {
            return 10;
        }
    }
}
