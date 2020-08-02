package patterns.template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk redBean = new RedBeanSoyaMilk();
        redBean.make();

        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();

        //纯豆浆
        SoyaMilk soyaMilk = new PureSoyaMilk();
        soyaMilk.make();
    }
}
