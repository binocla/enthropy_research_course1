package space.enthropy.sem1.lesson6;

public class MainExample {
    public static void main(String[] args) {
//        DatabaseSource databaseSource = new DatabaseSource();
//        databaseSource.save();

        ExampleDatasource datasource = new DatabaseSource(); // восходящее преобразование (от дочернего к родительскому - теряем функционал дочернего)
        datasource.save();

        ((DatabaseSource) datasource).db(); // нисходящее преобразование (от общего к частному, то есть от родителя к дочернему)

    }
}
