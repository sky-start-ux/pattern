package patterns.visitor.example;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    private List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("经理A"));
        mStaffs.add(new Manager("经理B"));
        mStaffs.add(new Manager("经理C"));
        mStaffs.add(new Engineer("工程师A"));
        mStaffs.add(new Engineer("工程师B"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor){
        for (Staff mStaff : mStaffs) {
            mStaff.accept(visitor);
        }
    }
}
