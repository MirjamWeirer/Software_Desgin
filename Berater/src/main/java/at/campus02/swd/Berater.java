package at.campus02.swd;

public class Berater {
    private String name;
    private double hourlyRate;
    private double dailyRate;

    public Berater(String name, double hourlyRate, double dailyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
