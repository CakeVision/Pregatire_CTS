package example.builder.demo;

import example.builder.builder.HouseBuilder;
import example.builder.builder.IHouseBuilder;
import example.builder.director.HouseDirector;
import example.builder.model.House;

public class HouseBuilderClient {
    public static void main(String[] args){
        IHouseBuilder builder = new HouseBuilder();

        House house = builder.buildFoundation("TestHouse").build();
        System.out.println("Simple house: " + house );
        HouseDirector director = new HouseDirector();

        House prebuiltHouse = director.constructLuxuryHouse(new HouseBuilder());
        System.out.println("Prebuilt house: " +prebuiltHouse);


    }
}
