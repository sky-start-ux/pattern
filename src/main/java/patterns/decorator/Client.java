package patterns.decorator;

public class Client {
    public static void main(String[] args) {
        //装饰者模式下的订单
        //点一份LongBlack
        Drink longBlack = new LongBlack();
        System.out.println("费用:"+longBlack.cost());
        System.out.println("描述"+longBlack.getDes());
        //加入一份牛奶
        Drink milk = new Milk(longBlack);
        System.out.println("费用:"+milk.cost());
        System.out.println("描述"+milk.getDes());
    }
}
