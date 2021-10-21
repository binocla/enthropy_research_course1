package space.enthropy.lesson2;


import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String binocla = "Binocla";
        String theBest = "Binocla";
        System.out.println(binocla == theBest);

        String s =  "Hello   World";
        System.out.println(s.length());
        // equals
        // charAt(int idx) -> symbol ar[i]
        // substring(2)
        // split -> String[].
        // toLowerCase
        // toUpperCase
        // contains("")
        // s.replace('r', '')
        System.out.println(s.replace('l', 'w'));
        // replaceAll
        System.out.println("Helllllo".indexOf('l'));
        System.out.println("Helllllo".lastIndexOf('l'));


//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        char ch = in.next().charAt(0);
//        boolean flag = false;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ch) {
//                System.out.print((i) + " ");
//                flag = true;
//            }
//        }
//        if (!flag) {
//            System.out.println(-1);
//        }

        /* todo
            Вводится строка
            Вводится символ
            Вывести все индексы (i) в строке, значения которых соответствуют введенному символу
            Если в строке нет символа - вывести -1
            I:
            Hello
            l
            O:
            2 3
         */

        // Литералы
        // Это специальные символы, позволяющие произвести какую-либо "операцию"
        /*
            \n -> nextLine -> отступ на следующую строку
            \b -> backspace -> стереть один символ (с конца)
            \s -> whitespace -> пробел
            \t -> tabulation -> табуляция (tab)
         */
        System.out.println("Hello\b\b\b\bWorld");

        // RegEx -> Regular Expression -> Регулярные выражения
        System.out.println(Arrays.toString("Hello   World Hi  Binocla".split("\\s+")));
        // \\s == \s == " "
        // \\s+ -> мы берем все пробелы подряд
        System.out.println(Arrays.toString("Hello   World Hi  йцу тд ЫФ йцу ыфв йцдвт йжлоуатдцло шугекртащшцугерм щтйшцкгер  Binoc @ @ la".split("^[[а-я]|[А-Я]]")));
        // [a-z] -> удаляет (split) по всем английским буквам: a b c ... z
        // [a-zA-Z] -> удаляет и маленькие, и большие
        // ^ -> отрицание
        // [0-9] -> удаляет все цифры
        // [0-9]+ -> удаляет все числа
        System.out.println(("Hel[lo]World[Bino]cla".replaceAll("\\[|\\]", "")));
        // \\[
        // \\]
        // [a-z]|[A-Z] -> удаляет и a-z, и A-Z
        // \"
        // matches(regex) -> true/false есть ли в строке заданный Pattern
        System.out.println("Hello\"Binocla\"");



    }
}
