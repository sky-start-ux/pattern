package patterns.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new WriteStrategy();
        Context context = new Context(strategy);
        context.doAction();
    }
}
