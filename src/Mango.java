public class Mango extends Fruit implements Peelable, SeedRemovable {
    private boolean hasPeel = true;
    private boolean hasSeeds;

    public Mango(double weight, double sugarContent, double waterContent, Color color, boolean hasPeel, boolean hasSeeds) {
        super(weight, sugarContent, waterContent, color);
        this.hasPeel = hasPeel;
        this.hasSeeds = hasSeeds;
    }

    @Override
    public void peelOff() {
        hasPeel = false;
    }

    @Override
    public boolean hasPeel() {
        return hasPeel;
    }

    @Override
    public void removeSeeds() {
        hasSeeds = false;
    }

    @Override
    public boolean hasSeeds() {
        return hasSeeds;
    }
}
