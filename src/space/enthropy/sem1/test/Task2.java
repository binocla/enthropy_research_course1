package space.enthropy.sem1.test;

public class Task2 {
    public static void main(String[] args) {
//        Task2 t = new Task2();
        int[] ar = {1, 2, 3, 4};
        System.out.println(solve2(ar));
    }

    public static int solve2(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 5 == 0) {
                sum += ar[i];
            }
        }
        return sum;
    }
}
