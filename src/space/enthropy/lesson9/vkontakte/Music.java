package space.enthropy.lesson9.vkontakte;

public class Music implements Payment {
    private double hoursRemained = 100;
    private int amountOfDownloadedTracks;
    private int amountOfAddedTracks;

    @Override
    public void operation() {
        System.out.println("75rub");
    }

    public Music() {
    }

    public Music(double hoursRemained, int amountOfDownloadedTracks, int amountOfAddedTracks) {
        this(amountOfDownloadedTracks, amountOfAddedTracks);
        this.hoursRemained = hoursRemained;
    }

    public Music(int amountOfDownloadedTracks, int amountOfAddedTracks) {
        this.amountOfDownloadedTracks = amountOfDownloadedTracks;
        this.amountOfAddedTracks = amountOfAddedTracks;
    }

    public int getAmountOfDownloadedTracks() {
        return amountOfDownloadedTracks;
    }

    public void setAmountOfDownloadedTracks(int amountOfDownloadedTracks) {
        this.amountOfDownloadedTracks = amountOfDownloadedTracks;
    }

    public int getAmountOfAddedTracks() {
        return amountOfAddedTracks;
    }

    public void setAmountOfAddedTracks(int amountOfAddedTracks) {
        this.amountOfAddedTracks = amountOfAddedTracks;
    }

    public double getHoursRemained() {
        return hoursRemained;
    }

    @Override
    public String toString() {
        return "Music{" +
                "hoursRemained=" + hoursRemained +
                ", amountOfDownloadedTracks=" + amountOfDownloadedTracks +
                ", amountOfAddedTracks=" + amountOfAddedTracks +
                '}';
    }

    public void download() {
        this.amountOfDownloadedTracks++;
    }

    public void add() {
        this.amountOfAddedTracks++;
    }
}
