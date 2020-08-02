package patterns.strategy;
//实现策略1
public class PrintStrategy implements Strategy {
    @Override
    public void testStrategy() {
        System.out.println("我要打印");
    }
}
