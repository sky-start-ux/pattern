package patterns.responsibilityChain;

public class MasterApprover extends Approver {
    public MasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 10000)
            System.out.println(" " + request.getId() + " "  + this.name + " 处理");
        else
            approver.processRequest(request);
    }
}
