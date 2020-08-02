package patterns.mediator;

public class ConcreteMediator implements Mediator {
    private Army army = null;
    private Government government = null;
    private People people = null;

    public ConcreteMediator(Army army, Government government, People people) {
        this.army = army;
        this.government = government;
        this.people = people;
    }


    @Override
    public void changeGood(Element element) {
        if ("Army".equalsIgnoreCase(element.getClass().getSimpleName())){
            element.changeGood();
            government.changeGood();
            people.changeGood();
        }
        if ("People".equalsIgnoreCase(element.getClass().getSimpleName())){
            element.changeGood();
            government.changeGood();
            army.changeGood();
        }
        if ("government".equalsIgnoreCase(element.getClass().getSimpleName())){
            element.changeGood();
            people.changeGood();
            army.changeGood();
        }
    }

    @Override
    public void changeBad(Element element) {
        if ("Army".equalsIgnoreCase(element.getClass().getSimpleName())){
            element.changeBad();
            government.changeBad();
            people.changeBad();
        }
        if ("People".equalsIgnoreCase(element.getClass().getSimpleName())){
            element.changeBad();
            government.changeBad();
            army.changeBad();
        }
        if ("government".equalsIgnoreCase(element.getClass().getSimpleName())){
            element.changeBad();
            people.changeBad();
            army.changeBad();
        }
    }
}
