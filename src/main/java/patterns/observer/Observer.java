package patterns.observer;

//观察者接口，有观察者实现
public interface Observer {
    public void update(float temp,float pressure, float humidity);
}
