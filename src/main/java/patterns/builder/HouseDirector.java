package patterns.builder;
//指挥者
public class HouseDirector {
    private HouseBuilder houseBuilder = null;
    //构造器传入依赖
    HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //setter方法传入houseBuilder
    void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程交给指挥者
    House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return houseBuilder.buildHouse();
    }
}
