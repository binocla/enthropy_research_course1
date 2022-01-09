package space.enthropy.examtasks.vkontakte;

public class Group extends Page implements Role, Notification {
    private User owner;
    private int amountOfFollowers;
    private String theme;

    public void kickAll() {
        this.amountOfFollowers = 0;
    }

    public String launchAds() {
        return amountOfFollowers >= 100 ? "Successfully" : "Not enough followers";
    }

    public Group(User owner, int amountOfFollowers, String theme) {
        this(owner);
        this.amountOfFollowers = amountOfFollowers;
        this.theme = theme;
    }

    public Group(User owner) {
        this.owner = owner;
        entries();
    }

    @Override
    public void paidSubscription() {
        System.out.println("VK Donuts");
    }

    @Override
    public boolean likePhoto() {
        return false;
    }

    @Override
    public void status() {
        System.out.println("I am group");
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getAmountOfFollowers() {
        return amountOfFollowers;
    }

    public void setAmountOfFollowers(int amountOfFollowers) {
        this.amountOfFollowers = amountOfFollowers;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Group{" +
                "owner=" + owner +
                ", amountOfFollowers=" + amountOfFollowers +
                ", theme='" + theme + '\'' +
                '}';
    }
}
