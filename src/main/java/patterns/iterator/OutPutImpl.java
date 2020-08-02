package patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    //输出学院、输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
    //遍历所有学院，然后调用printDepartment
    public void printCollege(){
        //从collegeList中取出所有学校，Java中的list已经实现了Iterator接口
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("============="+college.getName()+"=============");
            printDepartment(college.createIterator());//得到了对应的迭代器
        }
    }
}
