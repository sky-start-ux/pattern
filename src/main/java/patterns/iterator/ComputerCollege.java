package patterns.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;//保存当前数组的对象个数
    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("Java","Java");
        addDepartment("PHP","Java");
        addDepartment("C++","Java");
    }
    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department =new Department(name,des);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
