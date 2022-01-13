public class Prodcast {
    private String name;
    private String url;
    private double minutes;

    public Prodcast(String name, String url, double minutes) {
        this.name = name;
        this.url = url;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }
}
