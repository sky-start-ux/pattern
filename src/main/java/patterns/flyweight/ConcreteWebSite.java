package patterns.flyweight;
//具体网站
public class ConcreteWebSite extends WebSite {
    //内部状态，共享的部分
    private String type ="";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    //user为外部状态，非共享部分
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type +"  使用者为"+user.getName());
    }
}
