package patterns.mediator;

public class Client {
    public static void main(String[] args) {
        Army army = new Army();
        Government government = new Government();
        People people = new People();

        Mediator mediator = new ConcreteMediator(army,government,people);
        mediator.changeGood(army);

        System.out.println("===================");

        mediator.changeBad(government);
    }
}
