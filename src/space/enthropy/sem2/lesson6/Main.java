package space.enthropy.sem2.lesson6;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        // Работа с файлами
        InputStream inputStream;

        try {
//            FileInputStream f = new FileInputStream("src/space/enthropy/sem2/lesson6/test.txt");
//            String output = "";
//            int val = f.read();
//            while (val != -1) {
//                output += (char) val;
//                val = f.read();
//            }
//            FileOutputStream fo = new FileOutputStream("src/space/enthropy/sem2/lesson6/output.txt", true);
//            fo.write(output.getBytes());
//            f.close();
//            fo.close();
            FileReader f = new FileReader("src/space/enthropy/sem2/lesson6/test.txt");
            int val = f.read();
            String output = "";
            while (val != -1) {
                output += (char) val;
                val = f.read();
            }
            FileWriter fw = new FileWriter("src/space/enthropy/sem2/lesson6/outputChar.txt", true);
            fw.write(output);
            f.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Нет файла!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream outputStream;
    }
}
