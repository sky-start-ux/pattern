package patterns.facade;

public class DVDPlayer {
    //使用单例模式，饿汉式
    private static final DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance(){
        return instance;
    }
    private DVDPlayer(){};

    public void on(){
        System.out.println("dvd on");
    }
    public void off(){
        System.out.println("dvd off");
    }
    public void play(){
        System.out.println("dvd is playing");
    }
}
