package patterns.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();

        //创建代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDaoImpl());

        //通过代理对象，调用到被代理对象的方法，即执行的是代理对象的方法，
        // 代理对象再去调用目标对象的方法
        proxy.teach();
    }
}
