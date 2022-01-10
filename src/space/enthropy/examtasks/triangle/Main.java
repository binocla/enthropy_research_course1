package space.enthropy.examtasks.triangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1, 1, 5, 4, 3);
        Triangle triangle1 = new Triangle(1, 1, 1, 5, 4, 3);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());
        System.out.println(Arrays.toString(triangle.angles()));
        System.out.println(triangle);
        Triangle[] triangles = {triangle, triangle1};
        System.out.println(totalPerimeter(triangles));
        System.out.println(twoTrianglesAreEquivalent(triangles));
    }

    public static double totalPerimeter(Triangle[] triangles) {
        double sumOfPerimeter = 0;
        for (int i = 0; i < triangles.length; i++) {
            sumOfPerimeter += triangles[i].perimeter();
        }
        return sumOfPerimeter;
    }

    public static boolean twoTrianglesAreEquivalent(Triangle[] triangles) {
        for (int i = 0; i < triangles.length; i++) {
            for (int j = i + 1; j < triangles.length; j++) {
                if (triangles[i].equals(triangles[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
