package patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    private List<Department> departments;
    private int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    //判断集合中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departments.size() -1)
            return false;
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
