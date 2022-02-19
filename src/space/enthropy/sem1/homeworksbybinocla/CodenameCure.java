package space.enthropy.sem1.homeworksbybinocla;

import java.util.Scanner;

/**
 * A solis ortu usque ad occasum
 * A prima facie никто
 * В клоаке снега тщетных обещаний
 * Найду себе ab ovo самого
 * И как бы не старался сгинуть
 * В дисперсии прекрасного ума
 * Как зиккурат статичен и стабилен
 * Над энтропийными оркестрами себя
 * <p>
 * - Нелепо ранжированным почерком написал стихотворение на салфетке. Binocla в Питере. Тут всегда так: либо спиваешься, либо вешаешься. Тяжко походить на поэта, будучи окрыленным корявыми переводами Керуака.
 * Впрочем, вы можете помочь Binocla с его стихотворением и дать надежду на публикацию в местный сборник питерских писак.
 * У издательства есть ряд требований:
 * 1) Необходимо посчитать и вывести количество английских и русских букв 'o' в стихотворении
 * 2) Необходимо каждое слово с тремя и более русскими гласными перевести в верхний регистр
 * 3) Каждое пятое слово вне зависимости от предыдущих пунктов перевести в чередующийся регистр (Начинается с верхнего, Sergey -> SeRgEy)
 * 4) Наконец, очень важно разделить стихотворение по строфам (4 строки) отступом (то есть после 4-х строк должна идти пустая перед продолжением последующих) и поставить точки в конце каждой строфы
 * <p>
 * Примечание: Вы можете разбить выполнение задач на методы. Важно, чтобы решение могло отслеживаться поэтапно (например, перед выполнением задания 2 выводится Task 2). Изменяться должна только одна и та же переменная, хранящая текст стихотворения
 * <p>
 * Примечание по решению: Запрещено использование StringBuilder, Arrays, любых иных вспомогательных классов, за исключением String, Character
 */


public class CodenameCure {
    static String poem = """
            A solis ortu usque ad occasum
            A prima facie никто
            В клоаке снега тщетных обещаний
            Найду себе ab ovo самого
            И как бы не старался сгинуть
            В дисперсии прекрасного ума
            Как зиккурат статичен и стабилен
            Над энтропийными оркестрами себя
            """;

    public static void main(String[] args) {
        System.out.println("Task 1");
        int cntEn = 0;
        int cntRu = 0;
        for (int i = 0; i < poem.length(); i++) {
            if (poem.charAt(i) == 'o') {
                cntEn++;
            }
            if (poem.charAt(i) == 'о') {
                cntRu++;
            }
        }
        System.out.println("Ru " + cntRu + " En " + cntEn);
        System.out.println("Task 2");
        String[] s = poem.split("\\s");
        for (String q : s) {
            int cnt = 0;
            for (int i = 0; i < q.length(); i++) {
                switch (q.charAt(i)) {
                    case 'а', 'о', 'е', 'ё', 'у', 'я', 'ю', 'ы', 'и', 'э' -> cnt++;
                }
            }
            if (cnt >= 3) {
                poem = poem.replaceAll(q, q.toUpperCase());
            }
        }
        System.out.println(poem);
        System.out.println("Task 3");
        int cnt = 1;
        s = poem.split("\\s");
        for (String q : s) {
            if (cnt == 5) {
                String res = "";
                for (int i = 0; i < q.length(); i++) {
                    if (i % 2 == 0) {
                        res += Character.toUpperCase(q.charAt(i));
                    } else {
                        res += Character.toLowerCase(q.charAt(i));
                    }
                }

                poem = poem.replace(q, res);
                cnt = 0;
            }
            cnt++;
        }
        System.out.println(poem);
        System.out.println("Task 4");
        int countOfLines = 0;
        String result = "";
        Scanner in = new Scanner(poem);
        while (in.hasNextLine()) {
            countOfLines++;
            if (countOfLines == 4) {
                result += in.nextLine();
            } else {
                result += in.nextLine() + "\n";
            }
            if (countOfLines == 4) {
                result += ".\n\n";
                countOfLines = 0;
            }
        }
        poem = result.trim();
        System.out.println(poem);
    }
}
