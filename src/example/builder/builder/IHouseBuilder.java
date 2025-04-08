package example.builder.builder;

import example.builder.model.House;
import example.builder.model.IHouse;

public interface IHouseBuilder {
    IHouseBuilder buildFoundation(String type);
    IHouseBuilder buildStructure(String type);
    IHouseBuilder buildRoof(String type);
    IHouseBuilder buildInterior(String type);
    IHouseBuilder withGarage(boolean hasAttr);
    IHouseBuilder withGarden(boolean hasAttr);
    IHouseBuilder withSwimmingPool(boolean hasAttr);
    House build();


//    public String foundation;
//    public String structure;
//    public String roof;
//    public String interior;
//    public boolean hasGarage;
//    public boolean hasGarder;
//    public boolean hasSwimmingPool;

}
