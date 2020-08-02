package patterns.singleton.type2;

/**
 *  饿汉式（静态代码块）
 *  优缺点说明：
 *      1、这种方式和上面的方法类似。
 *      优缺点说明：
 *        1、优点：这种写法比较简单，就是在类装载的时候完成实例化，避免了线程同步问题
 *        2、缺点：在类装载的时候完成实例化，没有达到Lazy Loading的效果，如果从始至终从未使用过这个实例，则会
 *        造成内存的浪费
 *        3、这种方式基于classLoader机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式
 *        中大多数都是调用getInstance方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式导致类装载，这
 *        时候初始化instance就没有达到lazy loading的效果
 *        4、这种单例模式可用，可能造成内存浪费
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
    }
}

// 饿汉式（静态代码块）
class Singleton{
    //构造器私有，外部不能new
    private Singleton(){}

    //本类内部创建对象实例
    private final static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
