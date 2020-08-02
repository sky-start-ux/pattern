package patterns.mediator;

/**
 * 元素-政府
 */
public class Government extends Element{
    @Override
    public void changeGood() {
        System.out.println("政府有钱");
    }

    @Override
    public void changeBad() {
        System.out.println("政府没钱");
    }
}
