package space.enthropy.sem2.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        stream1.forEach(x1 -> System.out.println(x1));
//        stream1.map(x -> x * 2)
//                .forEach(x1 -> System.out.println(x1));
//        Stream<Integer> stream2 = Stream.of(1, 2, 3);
//        List<Integer> list = new ArrayList<>();
//        list.stream().

//        Stream.of(1, 2, 3, 4).map(x -> {
//            System.out.println("Started");
//            int sum = 5 + x;
//            return sum;
//        })
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        list.stream().map(x -> x * 2).forEach(x1 -> System.out.println(x1));
//        list.stream()
//                .skip(2)
//                .map(x -> x * 100)
//                .peek(x -> System.out.println("Current: " + x))
//                .limit(3)
//                .map(x -> x * 2)
//                .peek(x -> System.out.println("Next: " + x))
//                .filter(x -> x % 2 == 0)
//                .map(x -> x * 5)
//                .sorted(Comparator.reverseOrder())
//                .forEach(x -> System.out.println(x));
//        System.out.println(IntStream.range(0, 1000).min().getAsInt());
        String s = Stream.of("qwe", "binocla", "@binocla", "2313")
                .map(x -> x.toUpperCase())
                .reduce((x, y) -> {
                    System.out.println("Current x " + x);
                    System.out.println("Current y " + y);
                    return x + y;
                }).get();
        System.out.println(s);
        Stream.iterate(new int[]{1, 0}, (x) -> {
                    x[0] = x[0] + x[1];
                    return new int[]{x[0], x[1] + x[0]};
                })
                .limit(10)
                .forEach(x1 -> System.out.println(Arrays.toString(x1)));
//        for (String s : list1) {
//            System.out.println(s);
//        }

    }
}
