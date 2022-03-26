package space.enthropy.sem2.lesson7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 50; i++) {
            FileWriter fw =
                    new FileWriter("src/space/enthropy/sem2/lesson7/" + i + ".txt");
            fw.write(getRandomNumbers().toString().replaceAll("[\\[\\],]", ""));
            fw.close();
        }
    }

    private static List<Integer> getRandomNumbers() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int n = random.nextInt(9000) + 1000;
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(9000) - 4500);
        }
        return list;
    }
}
