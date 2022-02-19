package space.enthropy.sem1.extramaterials;

public class DoubleNotCorrect {
    public static void main(String[] args) {
        System.out.println(0.15 - 0.05); // 0.09999999999999999
        double origin = 0.15 - 0.05;
        double expected = 0.1;
        System.out.println(origin == expected);
        double epsilon = 0.01; // для оценки погрешности
        if (origin - expected <= epsilon) {
            System.out.println(true);
        }
        // Нужно ввести какую-либо переменную для корректной обработки погрешности
        // Есть специальный класс BigDecimal, который считает все с точностью и без вспомогательных переменных для оценки погрешности

    }
}
