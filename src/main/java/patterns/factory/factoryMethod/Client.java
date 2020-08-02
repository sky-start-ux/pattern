package patterns.factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        AirCondition airCondition = new HaierAirConditionFactory().makeAirCondition();
        AirCondition airCondition1 = new MideaAirConditionFactory().makeAirCondition();
        airCondition.work();
        airCondition1.work();
    }
}
