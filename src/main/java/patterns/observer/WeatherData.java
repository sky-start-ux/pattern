package patterns.observer;

import java.util.ArrayList;

/**
 *  1、包含最新的天气情况信息
 *  2、含有观察者集合，使用ArrayList管理
 *  3、当数据有更新时，就主动调用ArrayList，所有的接入方就看到消息
 */
public class WeatherData implements Subject{

    private float temp;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
    //当数据有更新时，据调用setData
    public void setData(float temp,float pressure,float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.temp,this.pressure,this.humidity);
        }
    }
}
