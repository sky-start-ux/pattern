package patterns.visitor;

import java.util.LinkedList;
import java.util.List;
//数据结构，管理很多人
public class ObjectStructure {
    //维护一个集合
    private List<Person> persons = new LinkedList<>();
    //增加到list
    public void attach(Person p){
        persons.add(p);
    }
    //移除
    private void detach(Person p){
        persons.remove(p);
    }
    //显示测评结果
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
