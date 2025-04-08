package example.builder.model;

public class House implements IHouse{
    public String foundation;
    public String structure;
    public String roof;
    public String interior;
    public boolean hasGarage;
    public boolean hasGarder;
    public boolean hasSwimmingPool;

    public House(){}

    public String getFoundation() {
        return foundation;
    }
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
    public String getStructure() {
        return structure;
    }
    public void setStructure(String structure) {this.structure = structure;}
    public String getRoof() {
        return roof;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }
    public String getInterior() {
        return interior;
    }

    @Override
    public boolean hasGarage() {
        return hasGarage;
    }

    @Override
    public boolean hasGarden() {
        return hasGarder;
    }

    @Override
    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }
    public boolean isHasGarage() {
        return hasGarage;
    }
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
    public boolean isHasGarder() {
        return hasGarder;
    }
    public void setHasGarder(boolean hasGarder) {
        this.hasGarder = hasGarder;
    }
    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }
    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasGarder=" + hasGarder +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
