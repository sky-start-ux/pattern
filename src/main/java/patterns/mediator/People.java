package patterns.mediator;

public class People extends Element {

    @Override
    public void changeGood() {
        System.out.println("人民幸福");
    }

    @Override
    public void changeBad() {
        System.out.println("人民困难");
    }
}
