package space.enthropy.sem1.exam;

public class Exceptions {
    public static void main(String[] args) {
        // Object -> Throwable -> Error (end) | Exception
        // -> RuntimeExceptions (Arithmetic, IndexOutOfBounds, IllegalArgument...) | etc (FileNotFound, NoSuchMethod, IOException)
        try {
            System.out.println(1 / 1);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }

        System.out.println("Hello");
    }
}
