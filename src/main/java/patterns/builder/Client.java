package patterns.builder;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        //该高楼
        houseDirector.setHouseBuilder(new HighHouse());
        House setHouse = houseDirector.constructHouse();
    }
}
