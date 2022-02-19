package space.enthropy.sem1.lesson6;

public class FileDatasource implements ExampleDatasource {
    @Override
    public void save() {
        System.out.println("I saved info to the file");
    }

    public void file() {
        System.out.println("I am file");
    }
}
