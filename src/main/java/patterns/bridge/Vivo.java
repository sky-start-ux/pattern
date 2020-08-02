package patterns.bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机打开");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关闭");
    }
}
