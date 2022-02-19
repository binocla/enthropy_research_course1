package space.enthropy.sem2.lesson1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(1);
        System.out.println(intList);

        TreeSet<String> set = new TreeSet<>();
        set.add("Russia");
        set.add("USA");
        set.add("Japan");
        set.add("USA");
        set.add("Russia");
        set.add("Russia");
        set.add("Mongolia");
        System.out.println(set);
    }
}
