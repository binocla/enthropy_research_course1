package space.enthropy.lesson7;

public enum Months {
    Январь(1, "Водолей"),
    Февраль(2, "Рыбы"),
    Март(3, "Овен"),
    Апрель(4, "Телец"),
    Май(5, "Близнецы"),
    Июнь(6, "Близнецы"),
    Июль(7, "Рак"),
    Август(8, "Лев"),
    Сентябрь(9, "Девы"),
    Октябрь(10, "Весы"),
    Ноябрь(11, "Скорпион"),
    Декабрь(12, "Стрелец");

    private int numberOfMonth;
    private String zodiac;

    Months(int numberOfMonth, String zodiac) {
        this.numberOfMonth = numberOfMonth;
        this.zodiac = zodiac;
    }

    @Override
    public String toString() {
        return "Месяц " +
                name() +
                " номер месяца " + numberOfMonth +
                ", знак зодиака " + zodiac;
    }
}
