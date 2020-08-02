package patterns.builder;

public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼建墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高楼建屋顶");
    }
}
