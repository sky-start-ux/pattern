package patterns.factory.simpleFactory;

public class HumanFactory {

    public static Human getObject(String gender){
        if ("M".equalsIgnoreCase(gender)){
            return new Man();
        }
        if ("G".equalsIgnoreCase(gender)){
            return new Girl();
        }
        if ("R".equalsIgnoreCase(gender)){
            return new Robot();
        }
        throw new RuntimeException("error");
    }
}
