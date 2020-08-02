package patterns.observer;

public class CurrentConditions implements Observer {
    private float temp;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }


    public void display(){
        System.out.println("***Today Temp: " + temp + "*****");
        System.out.println("***Today pressure: " + pressure + "*****");
        System.out.println("***Today humidity: " + humidity + "*****");
    }
}
