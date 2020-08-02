package patterns.proxy.dynamicProxy;

public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中。。。。。。。。。。。");
    }

    @Override
    public void saying() {
        System.out.println("老师说话。。。。。。。。。。。");
    }


}
