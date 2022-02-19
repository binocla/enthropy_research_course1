package space.enthropy.sem1.lesson6.part1;

// Когда мы наследуемся от абстрактного класса мы обязаны реализовать ВСЕ его абстрактные методы
public class Circle extends ShapeOfCircleAndSquare {

    @Override
    public void square(int x) {
        super.square = Math.PI * x * x;
    }

  

}
