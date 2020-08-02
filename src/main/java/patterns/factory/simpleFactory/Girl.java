package patterns.factory.simpleFactory;

public class Girl implements Human {
    @Override
    public void makeHuman() {
        System.out.println("造了个女孩");
    }
}
