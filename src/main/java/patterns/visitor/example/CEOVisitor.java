package patterns.visitor.example;

public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", KPI: " + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", KPI: " + manager.getKpi() +
                ", 新产品数量: " + manager.getProducts());
    }
}
