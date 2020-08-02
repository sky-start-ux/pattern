package patterns.flyweight;

public class Client {
    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use(new User("新浪"));

        WebSite webSite1 = webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(new User("博客园"));

        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("简书"));

        System.out.println(webSiteFactory.getWebSiteCount());


    }
}
