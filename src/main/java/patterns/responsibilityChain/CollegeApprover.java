package patterns.responsibilityChain;

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (5000 <= request.getPrice() && request.getPrice() <= 10000)
            System.out.println(" " + request.getId() + " "  + this.name + " 处理");
        else
            approver.processRequest(request);
    }
}
