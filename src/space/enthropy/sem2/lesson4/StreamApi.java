package space.enthropy.sem2.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>(List.of(1L, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l, 10l));
        // Stages of Steam API: 1, 2, 3
        // 1 -> Init (Stream.of(1, 2, 3, "qweqwe", new Scaner()...) (Object)
        // Stream<Integer> stream = Stream.of(1, 2, 3, 4); (Типизировали)
        // list.stream() -> Stream
        // "qweqwe".chars()
        // IntStream, LongStream, DoubleStream, Stream

        // 2 -> operations.
        // map(x -> x * 5) 1 -> 1
        // filter(x -> x % 2 == 0)
        // limit(3)
        // skip(2)
        // peek(x -> System.out.println(x))
        // sorted(Comparator.reverseOrder())
        // distinct()
        // flatMap(x -> IntStream.range(0, x)) : 1 -> n
        // .....
        // 3 -> terminal operations
        // forEach(x -> System.out.println(x))
        // sum();
        // max()
        // min()
        // collect(Collectors.)
        // reduce()
        long multi = LongStream.of(1, 2, 3, 4, 5, 6)
                        .reduce((x, y) -> x * y).getAsLong();

        long multiStandard = 1;
        long[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            multiStandard *= array[i];
        }
        // Method Reference
        System.out.println(multiStandard);
        System.out.println(multi);


        StreamApi streamApi = new StreamApi();
        streamApi.eval();
        Stream<Integer> str = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        str.map(StreamApi::sum1).forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(streamApi.task2(list));


    }

    public int sum(int x) {
        return x + 5;
    }
    public static int sum1(int x) {
        return x + 5;
    }
    public void eval() {
        Stream<Integer> str = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        str.map(this::sum).forEach(System.out::println);
    }

    public long task2(ArrayList<Long> list) {
        return list.stream().filter(x -> x % 2 == 0)
                .map(x -> (long) Math.pow(x, 2))
                .reduce((x, y) -> x + y).get();

        // 2^2 + 4^2 + 6^2 + 8^2 + 10^2
    }
}
