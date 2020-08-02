package patterns.singleton.type6;

/**
 *  单例模式：静态内部类
 *      优缺点说明：
 *          1、这种方法采用了类加载机制来保证初始化实例时只有一个线程
 *          2、静态内部类方式在Singleton类被加载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才
 *          会装载SingletonInstance类，从而完成Singleton的实例化
 *          3、类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行
 *          初始化时，别的线程无法进入
 *          4、避免了线程不安全，利用静态内部类特点实现了延迟加载，效率高
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
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
