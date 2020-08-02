package patterns.factory.factoryMethod;

public class HaierAirCondition implements AirCondition {
    @Override
    public void work() {
        System.out.println("海尔空调正在工作");
    }
}
