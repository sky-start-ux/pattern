package patterns.singleton.type4;

/**
 * 懒汉式，线程安全、同步方法
 *  优缺点：
 *      1、解决了线程不安全问题
 *      2、效率太低了，每个线程在想获得类的实例的时候，执行getInstance()方法都要进行同步，而其实这个方法只执行一次
 *      实例化代码就够了，后面想获得该类实例，直接return就行了，方法进行同步效率太低。
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Singleton.getInstance());//patterns.singleton.type4.Singleton@1b6d3586
                }
            }).start();
        }
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    /**
     * 提供一个静态的公有方法，加入了同步处理的代码，解决了线程安全问题，
     *  当使用到该方法时，才会去创建instance，懒汉式
     */
    static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
