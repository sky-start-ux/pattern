package patterns.factory.factoryMethod;

public class HaierAirConditionFactory implements AirConditionFactory {
    @Override
    public AirCondition makeAirCondition() {
        System.out.println("生产海尔空调");
        return new HaierAirCondition();
    }
}
