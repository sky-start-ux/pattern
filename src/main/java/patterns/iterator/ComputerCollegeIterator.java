package patterns.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //需要知道Department的存放方式,假设数组
    private Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
}
