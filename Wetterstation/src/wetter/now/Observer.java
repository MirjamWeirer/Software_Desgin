package wetter.now;

public interface Observer {
    public void update(double temp, double humidity, double pressure);
}
