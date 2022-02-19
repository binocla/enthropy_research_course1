package space.enthropy.sem1.examtasks.triangle;

import static java.lang.Math.*;

public class Triangle {
    private int x1; // field | attribute | property of class : global variable inside class | variable on class-level
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int var = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2); // https://www.geeksforgeeks.org/check-whether-triangle-is-valid-or-not-if-three-points-are-given/
        if (var == 0) {
            System.out.println("Not triangle");
            return;
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        aSide = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        bSide = sqrt(Math.pow(x3 - x2, 2) + pow(y3 - y2, 2));
        cSide = sqrt(Math.pow(x3 - x1, 2) + pow(y3 - y1, 2));
    }

    public double perimeter() {
        return aSide + bSide + cSide;
    }

    public double square() {
        return round(sqrt(perimeter() / 2 * (perimeter() / 2 - aSide) * (perimeter() / 2 - bSide) * (perimeter() / 2 - cSide)));
    }

    public double[] angles() {

        double cSideAngle = acos((pow(aSide, 2) + pow(bSide, 2) - pow(cSide, 2)) / (2 * aSide * bSide));
        double aSideAngle = acos((pow(cSide, 2) + pow(bSide, 2) - pow(aSide, 2)) / (2 * cSide * bSide));
        double bSideAngle = acos((pow(cSide, 2) + pow(aSide, 2) - pow(bSide, 2)) / (2 * aSide * cSide));
        return new double[]{aSideAngle, bSideAngle, cSideAngle};
    }

    @Override
    public String toString() {
        return "Треугольник с координатами: " +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3;
    }

    @Override
    // signature: equals(Object)
    // declaration: modifier | return type | name of method | parameter list | exception list | method body
    public boolean equals(Object o) {
        if (this == o) { // если сравниваем с самим собой
            return true; // очевидно, true
        }
        if (o == null || getClass() != o.getClass()) {
            // Сначала (обязательно!) проверяем, не пустота ли к нам пришла
            // Только потом смотрим на "природу" классов (телефон с домом сравнить не можем)
            // Важно! У null нет методов! Поэтому именно такой порядок и именно || (Lazy)
            return false;
        }

        Triangle triangle = (Triangle) o;

        return x1 == triangle.x1 && y1 == triangle.y1 && x2 == triangle.x2
                && y2 == triangle.y2 && x3 == triangle.x3 && y3 == triangle.y3;
    }
}
