package patterns.singleton.type3;

/**
 * 懒汉式，线程不安全
 *  优缺点：
 *      1、起到了Lazy Loading的效果，但是只能在单线程下使用
 *      2、如果在多线程下，一个线程进入了if(singleton==null)判断语句块，还未来得及往下执行，另一个线程也通过了这
 *      和判断语句，这时就会产生多个实例，所以在多线程的情况下不可使用这种方式。
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance = Singleton.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才会去创建instance，懒汉式
     */
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
