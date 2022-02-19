package space.enthropy.sem1.examtasks;

public class OrderOfExecution {
    static {
        System.out.println("Static block"); // 1
    }

    {
        System.out.println("Non-static block"); // 3
    }

    public OrderOfExecution() {
        System.out.println("Constuctor"); // 4
    }
}

class OrderOfExecutionChild extends OrderOfExecution {
    static {
        System.out.println("Static block from child"); // 2
    }

    {
        System.out.println("Non-static block from child"); // 5
    }

    public OrderOfExecutionChild() {
        System.out.println("Constuctor of child"); // 6
    }

    public static void main(String[] args) {
        new OrderOfExecutionChild();
    }
}
