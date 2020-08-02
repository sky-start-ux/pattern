package patterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDaoProxy{
    private ITeacherDao target;//目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        /**
         * loader:指定目标对象使用的类加载器，获取加载器的方法固定
         * interface：指定目标对象实现的接口类型，使用泛型确认类型
         * InvocationHandler；事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始");
                        Object invoke = method.invoke(target, args);
                        System.out.println("动态代理结束");
                        return invoke;
                    }
                });
    }
}
