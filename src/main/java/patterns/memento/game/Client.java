package patterns.memento.game;

public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole =new GameRole();
        gameRole.setDamage(100);
        gameRole.setDefense(100);
        System.out.println("和boss大战前的状态");
        gameRole.display();

        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战之后的状态");
        gameRole.setDefense(30);
        gameRole.setDamage(30);

        gameRole.display();

        System.out.println("大战后使用备忘录模式，回复到以前的状态");
        gameRole.recoverGameRole(caretaker.getMemento());
        gameRole.display();
    }
}
