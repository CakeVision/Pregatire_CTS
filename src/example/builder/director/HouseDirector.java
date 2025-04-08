package example.builder.director;

import example.builder.builder.IHouseBuilder;
import example.builder.model.House;

public class HouseDirector {
    public House constructLuxuryHouse(IHouseBuilder builder) {
        return builder
                .buildFoundation("Concrete")
                .buildStructure("Brick")
                .buildRoof("Slate")
                .buildInterior("Luxurious")
                .withGarage(true)
                .withGarden(true)
                .withSwimmingPool(true)
                .build();
    }

    public House constructBasicHouse(IHouseBuilder builder) {
        return builder
                .buildFoundation("Concrete")
                .buildStructure("Wood")
                .buildRoof("Asphalt shingles")
                .buildInterior("Basic")
                .withGarage(false)
                .withGarden(false)
                .withSwimmingPool(false)
                .build();
    }
}
