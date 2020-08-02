package patterns.visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男观众给出赞同票");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女观众给出赞同票");
    }
}
