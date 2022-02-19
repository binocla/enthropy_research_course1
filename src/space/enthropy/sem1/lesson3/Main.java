package space.enthropy.sem1.lesson3;

public class Main {

    static String hi;
    public static void main(String[] args) {
        Transport.calc(5, 2);
        int res = Transport.calc(1, 2, 3);
        int l = calc(2, 5);
        String x = hi;
        String c = Main.hi;
        System.out.println(calc(2, 3));
        System.out.println(Transport.result);
        Transport transport = new Transport();
        System.out.println(Transport.color);
        System.out.println(transport.age);
        Transport transport1 = new Transport();
        Transport transport2 = new Transport();
        System.out.println(transport1.age);
        System.out.println(transport2.age);
        System.out.println(Transport.color);
    }

    public static int calc(int x, int y) {
        return x + y;
    }
}
