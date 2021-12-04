package space.enthropy.lesson9.vkontakte;

import java.util.Random;

public class Games implements Payment {
    private String theme;
    private boolean isAdobeFlash;
    private String name;

    @Override
    public void operation() {
        System.out.println("10 golosov");
    }

    public Games(String theme, String name) {
        this.theme = theme;
        this.name = name;
    }

    public Games(String theme, boolean isAdobeFlash, String name) {
        this(theme, name);
        this.isAdobeFlash = isAdobeFlash;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public boolean isAdobeFlash() {
        return isAdobeFlash;
    }

    public void setAdobeFlash(boolean adobeFlash) {
        isAdobeFlash = adobeFlash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Games{" +
                "theme='" + theme + '\'' +
                ", isAdobeFlash=" + isAdobeFlash +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isActive() {
        return true;
    }

    public void howManyPlayersOnline() {
        System.out.println("Right now there are about ~" + new Random().nextInt( 1000) + 23);
    }
}
