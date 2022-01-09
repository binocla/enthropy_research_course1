package space.enthropy.examtasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] ar = new String[n][n];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = in.next();
            }
        }
        boolean vowelsMoreThanConsonants = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { // проверка на главную диагональ
                    int consonants = 0;
                    int vowels = 0;
                    for (int k = 0; k < ar[i][j].length(); k++) {
                        if (isVowel(ar[i][j].charAt(k))) {
                            vowels++;
                        } else {
                            consonants++;
                        }
                    }
                    if (consonants >= vowels) {
                        vowelsMoreThanConsonants = false;
                        break;
                    }
                }
            }
        }
        int columnOk = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean flagVowelsOk = false;
            for (int j = 0; j < ar.length; j++) {
                int vowelPair = 0;
                String currStr = ar[j][i];
                for (int k = 0; k < currStr.length(); k++) {
                    if (k == 1) {
                        if (isVowel(currStr.charAt(k)) && isVowel(currStr.charAt(0))) {
                            vowelPair++;
                        }
                    }
                    if (currStr.length() - k <= 2) {
                        if (isVowel(currStr.charAt(k)) && isVowel(currStr.charAt(k - 1))) {
                            vowelPair++;
                        }
                    }
                    if (k > 2 && currStr.length() - k > 2) {
                        if (isVowel(currStr.charAt(k)) && isVowel(currStr.charAt(k + 1)) && !isVowel(currStr.charAt(k - 1)) && !isVowel(currStr.charAt(k + 2))) {
                            vowelPair++;
                        }
                    }
                }
                if (vowelPair != 3) {
                    flagVowelsOk = false;
                    break;
                } else {
                    flagVowelsOk = true;
                }
            }
            if (flagVowelsOk) {
                columnOk++;
            }
        }
        if (columnOk == 2 && vowelsMoreThanConsonants) {
            System.out.println("Ok");
        } else {
            System.out.println("Not ok");
        }
    }

    public static boolean isVowel(char ch) {
        return switch (ch) {
            case 'a', 'i', 'o', 'u', 'y', 'e', 'A', 'I', 'O', 'U', 'Y', 'E':
                yield true; // аналог return
            default:
                yield false;
        };
    }
}
