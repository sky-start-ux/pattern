package patterns.observer;
//接口，让WeatherData实现
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    void notifyObserver();
}
