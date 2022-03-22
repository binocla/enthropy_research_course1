import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GuavaExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // Standard
        HashMap<String, Integer> map = new HashMap<>();
        String[] split = s.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            String q = split[i];
            if (!map.containsKey(q)) {
                map.put(q, 0);
            }
            map.put(q, map.get(q) + 1);
        }
        System.out.println(map);

        // Google Guava

        Multiset<String> counter = HashMultiset.create();
        counter.addAll(List.of(split));
        System.out.println(counter);

    }
}
