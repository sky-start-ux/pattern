package patterns.builder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子建墙");

    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子建屋顶");
    }
}
