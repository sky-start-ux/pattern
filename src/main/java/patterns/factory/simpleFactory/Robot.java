package patterns.factory.simpleFactory;

public class Robot implements Human {
    @Override
    public void makeHuman() {
        System.out.println("造了个机器人");
    }
}
