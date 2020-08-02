package patterns.proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();

        //创建代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDaoImpl());

        ITeacherDao proxyInstance = (ITeacherDao) proxy.getProxyInstance();

        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();

        System.out.println("=======================");
        proxyInstance.saying();
    }
}
