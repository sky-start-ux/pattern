package patterns.builder;
//抽象的建造者
public abstract class HouseBuilder {
    private House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoofed();

    //建造房子好，返回产品
    House buildHouse(){
        return house;
    }
}
