package patterns.iterator;

import java.util.Iterator;
//学院
public interface College {
    String getName();
    void addDepartment(String name,String des);
    Iterator createIterator();
}
