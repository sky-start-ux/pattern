package patterns.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Girl g = (Girl) HumanFactory.getObject("G");
        g.makeHuman();
    }
}
