package space.enthropy.test;

public class Animal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.getClass());
        System.out.println(cat.toString());
        cat.binocla();
        cat.gav();
//        cat.meow();
    }

    public String name;

    public void gav() {
        System.out.println("F*ck you!");
    }

    public void binocla() {
        System.out.println("Binocla");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal {

    @Override
    public void binocla() {
        System.out.println("The best");
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
