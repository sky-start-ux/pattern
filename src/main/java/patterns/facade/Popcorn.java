package patterns.facade;

public class Popcorn {
    //使用单例模式，饿汉式
    private static final Popcorn instance = new Popcorn();
    public static Popcorn getInstance(){
        return instance;
    }
    private Popcorn(){};

    public void on(){
        System.out.println("popcorn on");
    }
    public void off(){
        System.out.println("popcorn off");
    }
    public void pop(){
        System.out.println("popcorn is poping");
    }
}
