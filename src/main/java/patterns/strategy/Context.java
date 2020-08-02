package patterns.strategy;
//执行策略
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doAction(){
        strategy.testStrategy();
    }
}
