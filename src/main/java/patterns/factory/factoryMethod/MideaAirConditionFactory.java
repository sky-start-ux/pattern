package patterns.factory.factoryMethod;

public class MideaAirConditionFactory implements AirConditionFactory {
    @Override
    public AirCondition makeAirCondition() {
        System.out.println("生产美的空调");
        return new MideaAirCondition();
    }
}
