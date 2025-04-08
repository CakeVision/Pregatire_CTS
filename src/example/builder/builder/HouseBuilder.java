package example.builder.builder;

import example.builder.model.House;

public class HouseBuilder implements IHouseBuilder {
    private House house = new House();
    @Override
    public IHouseBuilder buildFoundation(String type) {
        house.setFoundation(type);
        return this;
    }

    @Override
    public IHouseBuilder buildStructure(String type) {
        house.setStructure(type);
        return this;
    }

    @Override
    public IHouseBuilder buildRoof(String type) {
        house.setRoof(type);
        return this;
    }

    @Override
    public IHouseBuilder buildInterior(String type) {
        house.setInterior(type);
        return this;
    }

    @Override
    public IHouseBuilder withGarage(boolean hasAttr) {
        house.setHasGarage(hasAttr);
        return this;
    }

    @Override
    public IHouseBuilder withGarden(boolean hasAttr) {
        house.setHasGarder(hasAttr);
        return this;
    }

    @Override
    public IHouseBuilder withSwimmingPool(boolean hasAttr) {
        house.setHasSwimmingPool(hasAttr);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
