package patterns.composite;

import java.util.ArrayList;
import java.util.List;

//University就是Composite，可以管理College
public class University extends OrganizationComponent {
    List<OrganizationComponent> components = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println("=================="+getName()+"==================");
        for (OrganizationComponent component : components) {
            component.print();
        }
    }


}
