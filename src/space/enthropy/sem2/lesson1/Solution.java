package space.enthropy.sem2.lesson1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution {
    public static void main(String[] args) {
        Binocla b1 = new Binocla(12L, "qwe", new Reach[]{new Reach((short) 1, Topic.A)});
        Binocla b2 = new Binocla(12L, "qwe", new Reach[]{new Reach((short) 1, Topic.B)});
        Binocla b3 = new Binocla(13L, "qwe", new Reach[]{new Reach((short) 1, Topic.A)});
        Binocla b4 = new Binocla(12L, "qwe", new Reach[]{new Reach((short) 1, Topic.A)});
        Binocla b5 = new Binocla(15L, "qwe", new Reach[]{new Reach((short) 1, Topic.A)});
        LinkedHashSet<Binocla> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(b1);
        linkedHashSet.add(b2);
        linkedHashSet.add(b3);
        linkedHashSet.add(b4);
        linkedHashSet.add(b5);
        linkedHashSet.forEach(System.out::println);
    }
}


class Binocla {
    private long age;
    private String name;
    private Reach[] reach;

    public Binocla(long age, String name, Reach[] reach) {
        this.age = age;
        this.name = name;
        this.reach = reach;
    }

    @Override
    public String toString() {
        return "Binocla{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", reach=" + Arrays.toString(reach) +
                '}';
    }
}

class Reach {
    private short id;
    private Topic topic;

    public Reach(short id, Topic topic) {
        this.id = id;
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Reach{" +
                "id=" + id +
                ", topic=" + topic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reach reach = (Reach) o;

        if (id != reach.id) return false;
        return topic == reach.topic;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        return result;
    }
}

enum Topic {
    A, B, C
}
