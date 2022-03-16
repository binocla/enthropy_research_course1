package space.enthropy.sem2.lesson5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        // Task 2
        /*
            С помощью Stream API сложить все нечетные числа и положить их в LinkedList,
             в конце вывести
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            long val = in.nextLong();
            ar[i] = val;
        }
        // 1 2 3 4 5
        LinkedList<Long> list =
                Stream.of(Arrays.stream(ar)
                                .filter(x -> x % 2 != 0)
                                .reduce((x, y) -> x + y)
                                .getAsLong())
                        .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(list);
    }
}
