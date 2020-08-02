package patterns.strategy;
//实现策略类2
public class WriteStrategy implements Strategy {
    @Override
    public void testStrategy() {
        System.out.println("我要写字");
    }
}
