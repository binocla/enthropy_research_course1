package space.enthropy.sem1.lesson6;

public class DatabaseSource implements ExampleDatasource {
    @Override
    public void save() {
        System.out.println("I saved data to the database");
    }

    public void db() {
        System.out.println("I am database");
    }
}
