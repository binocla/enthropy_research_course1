package space.enthropy.sem1.examtasks.vkontakte;

public class User extends Page implements Role, Notification {
    private String login;
    private String password = "admin";
    private String name;

    public User(String login, String password, String name) {
        this(login, name);
        this.password = password;
    }

    public User(String login, String name) {
        this.login = login;
        this.name = name;
        entries();
    }

    public void createPost(String subject, String content) {
        System.out.println("Subject: " + subject);
        System.out.println("--------------------");
        System.out.println(content);
        System.out.println("--------------------");
    }

    public void deletePosts() {
        System.out.println("All posts are successfully deleted!");
    }

    @Override
    public void paidSubscription() {
        System.out.println("I do not pay for VK Music");
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean sendMessage() {
        return true;
    }

    @Override
    public boolean likePhoto() {
        return true;
    }

    @Override
    public void status() {
        System.out.println("I am user");
    }
}
