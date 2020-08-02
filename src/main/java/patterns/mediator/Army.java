package patterns.mediator;

/**
 * 元素-部队
 */
public class Army extends Element{
    @Override
    public void changeGood() {
        System.out.println("部队强大");
    }

    @Override
    public void changeBad() {
        System.out.println("部队弱小");
    }
}
