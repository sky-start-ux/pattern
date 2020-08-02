package patterns.singleton.type7;

/**
 * 枚举
 *  优缺点说明：
 *      借助JDK1.5添加的枚举来实现单例模式，不仅能避免多线程问题，而且还能防止反序列化重新创建对象
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                public void run() {
                    Singleton instance = Singleton.INSTANCE;
                    System.out.println(instance.hashCode());
                    instance.sayOK();
                }
            }).start();
        }
    }
}

enum Singleton{
    INSTANCE;   //属性
    public void sayOK(){
        System.out.println("ok");
    }
}