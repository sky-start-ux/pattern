package patterns.observer;

public class BaiduSite implements Observer {
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
        System.out.println("================百度=============");
        System.out.println("***百度 气温: " + temp + "*****");
        System.out.println("***百度 气压: " + pressure + "*****");
        System.out.println("***百度 湿度: " + humidity + "*****");
    }
}
