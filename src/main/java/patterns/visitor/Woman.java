package patterns.visitor;

/**
 * 这里使用了双分派，即首先在客户端程序中，将"具体状态"作为参数传递到Woman中（第一次分派）
 * 然后woman类调用作为参数的"具体方法"中方法getWomanResult，同时将自己（this）作为参数传入，完成第二次分派
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
