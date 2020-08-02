package patterns.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象  学校
        OrganizationComponent university = new University("清华大学","211");
        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院","coding");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院","学通信");
        //创建各个学院下面的系
        computerCollege.add(new Department("软件工程","学软件"));
        computerCollege.add(new Department("物联网工程","软硬件结合"));

        infoEngineerCollege.add(new Department("通信工程","学通信"));
        infoEngineerCollege.add(new Department("信息工程","coding"));

        //将学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //university.print();
        infoEngineerCollege.print();
    }
}
