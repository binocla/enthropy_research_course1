package space.enthropy.sem1.examtasks;

public class Binocla implements Sum, AnotherSum {
    public static void main(String[] args) {
        Binocla b = new Binocla();
        System.out.println(b.sum(2, 5));
    }

    @Override
    public int sum(int x, int y) {
        return x + y;
    }
}

interface Sum {
    int sum(int x, int y);
}

interface AnotherSum {
    int sum(int x, int y);
}
