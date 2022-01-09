package space.enthropy.examtasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println((int) 'a'); // 97
//        System.out.println((int) 'z'); // 122
//        System.out.println((int) 'A'); // 65
//        System.out.println((int) 'Z'); // 90

        int n = in.nextInt();
        int m = in.nextInt();
        String[][] strAr = new String[n][m];
        for (int i = 0; i < strAr.length; i++) {
            for (int j = 0; j < strAr.length; j++) {
                strAr[i][j] = in.next();
                boolean flagLower = false; // Будет отвечать за наличие строчных
                boolean flagUpper = false; // Будет отвечать за наличие строчных
                String currStr = strAr[i][j];
                for (int k = 0; k < currStr.length(); k++) {
                    if ((currStr.charAt(k) < 'a' && currStr.charAt(k) > 'Z') || (currStr.charAt(k) > 'z') || (currStr.charAt(k) < 'A')) { // Англ буквы
                        System.out.println("Строка не удовлетворяет условию");
                        System.exit(0); // ???, уточнить у Абра что делать если НЕ проходит по проверке на входные данные
                    }
                    if (currStr.charAt(k) >= 'a' && currStr.charAt(k) <= 'z') {
                        flagLower = true;
                    } else if (currStr.charAt(k) >= 'A' && currStr.charAt(k) <= 'Z') {
                        flagUpper = true;
                    }
                }
                if (!flagLower || !flagUpper) {
                    System.out.println("Строка не удовлетворяет условию");
                    System.exit(0);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            boolean isAllVowels = true; // flag ЗА гласные по позициям 0 2 4 ...
            boolean isAllLen = true;
            for (int j = 0; j < m; j++) {
                if (j >= 1) {
                    if (strAr[j - 1][i].length() >= strAr[j][i].length()) {
                        isAllLen = false;
                        break;
                    }
                }
                String currStr = strAr[j][i];
                for (int k = 0; k < currStr.length(); k += 2) {
                    switch (currStr.charAt(k)) {
                        case 'a', 'i', 'o', 'u', 'y', 'e', 'A', 'I', 'O', 'U', 'Y', 'E':
                            break;
                        default:
                            isAllVowels = false;
                            break;
                    }
                }
            }
            if (isAllVowels && isAllLen) {
                System.out.println("Ok");
                break;
            }
        }
    }
}
