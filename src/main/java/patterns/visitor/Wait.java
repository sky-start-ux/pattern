package patterns.visitor;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男观众待定");
    }

    @Override
    public void getWomanResult(Woman woman) {

        System.out.println("女观众待定");
    }
}
