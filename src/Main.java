import java.io.*;
import java.util.*;


public class Main {
    public static int countO(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' || str.charAt(i) == 'о') {
                count++;
            }
        }
        return count;
    }

    public static String vverh(String st) {
        String[] a = st.split(" ");
        char[] rus = new char[]{'ё', 'у', 'е', 'а', 'о', 'э', 'я', 'и', 'ю', 'ы'};
        String strok = "";
        for (int i = 0; i < a.length; i++) {
            int count_glas = 0;
            for (int j = 0; j < a[i].length(); j++) {
                for (char k : rus) {
                    if (a[i].charAt(j) == k) {
                        count_glas++;
                    }
                }
            }
            if (count_glas >= 3) {
                a[i] = a[i].toUpperCase();
            }
            strok += a[i] + " ";
        }
        return strok;
    }

    public static String good(String chert) {
        String temp = "";
        boolean flag = true;
        for (int i = 0; i < chert.length(); i++) {
            if (flag) {
                temp += Character.toUpperCase(chert.charAt(i));
                flag = false;
            } else {
                temp += Character.toLowerCase(chert.charAt(i));
                flag = true;
            }
        }
        return temp;
    }

    public static String updown(String line) {
        String test = line.replace("\n", " ");
        String[] b = test.split(" ");
        String c = "";
        for (int i = 0; i < b.length; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                b[i] = good(b[i]);
            }
            c += b[i] + " ";
        }
        return c;
    }

    public static int[] back(String pl) {
        int k = 0;
        for (int i = 0; i < pl.length(); i++) {
            if (pl.charAt(i) == '\n') {
                k++;
            }
        }
        int[] index = new int[k];
        int y = 0;
        for (int i = 0; i < pl.length(); i++) {
            if (pl.charAt(i) == '\n') {
                index[y] = i;
                y++;
            }
        }
        return index;
    }

    public static String last(int[] index, String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int a = 0;
            for (int j = 0; j < index.length; j++) {
                if (i == index[j]) {
                    str.trim();
                    str += "\n";
                    a = 1;
                }
            }
            if (a == 1) {
                continue;
            } else {
                str += s.charAt(i);
            }
        }
        return str;
    }

    public static String output(String s) {
        int k = 0;
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\n') {
                k++;
                if (k == 4) {
                    out += ".\n";
                    k = 0;
                }
            }
            out += s.charAt(i);

        }
        String lon = out.trim();
        lon += ".";
        return lon;
    }

    public static void main(String[] args) {
        String s = "A solis ortu usque ad occasum\n" +
                "A prima facie никто\n" +
                "В клоаке снега тщетных обещаний\n" +
                "Найду себе ab ovo самого\n" +
                "И как бы не старался сгинуть\n" +
                "В дисперсии прекрасного ума\n" +
                "Как зиккурат статичен и стабилен\n" +
                "Над энтропийными оркестрами себя";
        System.out.println(countO(s));
        s = vverh(s);
        int[] index = back(s);
        s = updown(s);
        s = last(index, s);
        s = output(s);
        System.out.print(s);
    }
}