package patterns.prototype.shallowCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("sky",1,"白");
        sheep.setFriend(new Sheep("tom",2,"block"));
        Sheep cloneSheep = (Sheep) sheep.clone();
        System.out.println(sheep.hashCode() == cloneSheep.hashCode());
        System.out.println(sheep);
        System.out.println(cloneSheep);
        System.out.println(sheep.getFriend().hashCode() == cloneSheep.getFriend().hashCode());
    }
}
