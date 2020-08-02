package patterns.visitor.example;

import java.util.Random;

public abstract class Staff {
    private String name;
    private int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKpi() {
        return kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }

    //核心方法，接收Visitor的访问
    public abstract void accept(Visitor visitor);
}
