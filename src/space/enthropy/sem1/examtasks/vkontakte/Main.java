package space.enthropy.sem1.examtasks.vkontakte;

public class Main {
    public static void main(String[] args) {
        User u = new User("binocla", "Sergey");
        Group gr = new Group(u, 1000, "IT");

        Notification n = new User("liwgfr", "Sergey");
        System.out.println(n.likePhoto());
        System.out.println(n.sendMessage());

        Page[] pages = {u, gr}; // Здесь мы создаем массив Pages (родительский класс) из дочерних (User & Group)
        // И благодаря тому, что метод paidSubscription у Page abstract, у каждого наследника своя реализация
        // Таким образом, пробегаясь в цикле по Page[] и вызывая метод с одним и тем же названием мы получаем разный результат (благодаря полиморфизму)
        for (int i = 0; i < pages.length; i++) {
            pages[i].paidSubscription();
        }
    }
}
