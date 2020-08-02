package patterns.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        UpRightPhone upRightPhone = new UpRightPhone(new Vivo());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }
}
