package patterns.visitor.example;

public class Client {
    public static void main(String[] args) {
        //构建报表
        BusinessReport businessReport = new BusinessReport();
        System.out.println("================CEO看报表=============");
        businessReport.showReport(new CEOVisitor());
        System.out.println("================CEO看报表=============");
        businessReport.showReport(new CTOVisitor());
    }
}
