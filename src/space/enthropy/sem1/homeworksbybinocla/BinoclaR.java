package space.enthropy.sem1.homeworksbybinocla;

import java.util.Scanner;

/**
 * Binocla очень любит пить Coca-Cola. Однажды он ехал на своем Rolls-Royce Cullinan по улице казани. Внезапно, сотрудники ДПС остановили его машину и решили проверить Binocla на опьянение. Сотрудник назвал N русских маленьких букв и попросил сказать ему в ответ лексикографически возрастающую и убывающую последовательность этих букв. Будучи пьяным Binocla сложно справиться с этой задачей. Помогите ему!
 * <p>
 * Input: N (1 <= N <= 100) — количество маленьких русских букв. Затем вводится последовательность символов. Ввод стандартный, через консоль.
 * Output: вывести отсортированные в лексикографическом порядке буквы через пробел (сначала по возрастанию, затем по убыванию)
 * <p>
 * Примеры:
 * 1)
 * 5
 * я а б в г
 * Вывод:
 * а б в г я
 * я г в б а
 * 2)
 * 1
 * г
 * Вывод:
 * г
 * г
 * <p>
 * Примечание: заметьте, что буквы могут повторяться. Необходимо рассматривать русский алфавит, включающий в себя все буквы.
 * <p>
 * Примечание по решению:
 * Разрешается использовать только массивы, циклы, условия. Запрещены коллекции, Stream API, сторонние библиотеки, Reflection API, Concurrent API, Map’ы. В качестве считывания использовать Scanner. Считывание символа — next().charAt(0) с помощью сканера. Запрещается использовать классы Arrays, Collections… Сортировка должна быть без помощи сторонних методов. Вывод отсортированных данных с помощью Arrays.toString() запрещен. Строки запрещены. Решение должно быть в методе public static void main. Название класса — BinoclaR
 */
public class BinoclaR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] ar = new char[n];
        int cntYo = 0;
        int cntYe = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = in.next().charAt(0);
            if (ar[i] == 'е') {
                cntYe++;
            } else if (ar[i] == 'ё') {
                cntYo++;
                ar[i] = 'е';
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i] < ar[j]) {
                    char temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (cntYe == 0 && cntYo != 0 && ar[i] == 'е') {
                ar[i] = 'ё';
                cntYo--;
            } else if (cntYe != 0 && ar[i] == 'е') {
                cntYe--;
            }
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            if (cntYe == 0 && cntYo != 0) {
                ar[i] = 'ё';
                cntYo--;
            }
            if (cntYe != 0) {
                cntYe--;
            }
            System.out.print(ar[i] + " ");
        }
    }
}
