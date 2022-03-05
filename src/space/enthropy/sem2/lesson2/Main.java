package space.enthropy.sem2.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if (n % 2 == 0) {
            System.exit(0);
        }
        HashMap<Long, Long> map = new HashMap<>();
        for (long i = 0; i < n; i++) {
            map.put(i, n - i);
        }
        for (int i = 0; i < map.keySet().size(); i += 2) {
            Long key = (Long) map.keySet().toArray()[i];
            System.out.println(key + " " + map.get(key));
        }
        System.out.println(map);

    }
}
