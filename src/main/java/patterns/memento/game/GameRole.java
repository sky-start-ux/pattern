package patterns.memento.game;

public class GameRole {
    private int damage;
    private int defense;

    //创建Memento，即根据当前状态得到memento
    public Memento createMemento(){
        return new Memento(damage,defense);
    }

    //从备忘录对象，恢复GameRole的状态
    public void recoverGameRole(Memento memento){
        this.damage = memento.getDamage();
        this.defense = memento.getDefense();
    }

    //显示当前游戏状态
    public void display(){
        System.out.println("当前攻击力为； " + this.damage + " ，防御力为：" + this.defense);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
