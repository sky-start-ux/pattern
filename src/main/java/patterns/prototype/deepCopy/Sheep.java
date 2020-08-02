package patterns.prototype.deepCopy;

import java.io.*;

public class Sheep implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String color;
    private Sheep friend;

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   /* //使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object sheep = null;
        //这里完成对基本属性和String的克隆
        sheep = super.clone();
        //对引用类型的属性，进行单独处理
        Sheep cloneSheep = (Sheep) sheep;
        if (friend != null){
            friend = (Sheep) friend.clone();
        }
        //System.out.println(friend);
        return cloneSheep;
    }*/

   //深拷贝 通过对象序列化实现
    @Override
    protected Object clone() {
        //创建流对象
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Object clone = ois.readObject();
            return clone;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                if (ois != null){
                    ois.close();
                }
                if (bis != null){
                    bis.close();
                }
                if (oos != null){
                    oos.close();
                }
                if (bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
