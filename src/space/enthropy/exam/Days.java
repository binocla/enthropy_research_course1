package space.enthropy.exam;

public enum Days {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numberOfDay;

    Days(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    @Override
    public String toString() {
        return "День недели: " + name() + ", числовое представление: " + numberOfDay;
    }
}
