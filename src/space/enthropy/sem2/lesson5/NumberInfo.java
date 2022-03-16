package space.enthropy.sem2.lesson5;

public class NumberInfo {
    public static void main(String[] args) {
        Integer a = 100;
        int b = 200;
        int c = a + b; // Unboxing
        Integer d = (int) a + b; // Autoboxing
        Integer l = b + b; // Autoboxing
        System.out.println(Integer.MAX_VALUE);
        System.out.println(b == a); // сравнение через int (Integer -> int)
        System.out.println(a + b);
        Float f = 2.3f;
        // System.out.println(a == b);

        // Long, Integer, Double, Short, Float, Byte, BigInteger, BigDecimal... extends Number
    }
}
