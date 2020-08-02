package patterns.adapter.interfaceAdapter;

public class Client {
    public static void main(String[] args) {
        new absAdapter(){
            @Override
            public void m1() {
                System.out.println("实现了m1方法");
            }
        }.m1();
    }
}
