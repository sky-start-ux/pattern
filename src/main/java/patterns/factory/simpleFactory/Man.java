package patterns.factory.simpleFactory;

public class Man implements Human {
    @Override
    public void makeHuman() {
        System.out.println("造了个男孩！");
    }
}
