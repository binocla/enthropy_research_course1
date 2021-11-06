package space.enthropy.lesson7;

public enum Cities {
    LONDON(213, "EN"),
    SARATOV(64, "RU"),
    KAZAN(777, "RU"),
    MOSCOW(666, "RU"),
    ANDORRA_LA_VELYA(999, "AN");

    private int code;
    private String region;

    Cities(int code, String region) {
        this.code = code;
        this.region = region;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Город " +
                name() +
                " код " + code +
                ", регион " + region;
    }
}
