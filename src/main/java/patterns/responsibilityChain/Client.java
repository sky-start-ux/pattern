package patterns.responsibilityChain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1,30000,1);

        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        MasterApprover masterApprover = new MasterApprover("王校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(masterApprover);
        masterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
