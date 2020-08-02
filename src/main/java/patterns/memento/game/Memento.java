package patterns.memento.game;

public class Memento {
    private int damage;//攻击力
    private int defense;//防御力

    public Memento(int damage, int defense) {
        this.damage = damage;
        this.defense = defense;
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
