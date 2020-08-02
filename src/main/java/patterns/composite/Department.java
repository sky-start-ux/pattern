package patterns.composite;

public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //不需要重写add，remove，因为它是叶子节点
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
