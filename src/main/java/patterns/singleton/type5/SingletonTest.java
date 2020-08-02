package patterns.singleton.type5;

/**
 * 双重检验锁：
 *  优缺点：
 *      1、Double-Check概念是多线程开发中经常使用到的，如代码所示，我们进行了两次if(singleton == null)检查，
 *      这样就可以保证线程安全了
 *      2、这样，实例化代码只执行一次，后面再次访问时，判断if(singleton == null)，直接return实例化对象，也避免
 *      了反复进行方法的同步
 *      3、线程安全，延迟加载，效率较高
 */
public class SingletonTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Singleton.getInstance());
                }
            }).start();
        }
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    /**
     * 提供一个静态的公有方法，加入了同步处理的代码，解决了线程安全问题，同时解决懒加载问题
     */
     static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
