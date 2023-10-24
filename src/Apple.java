public class Apple extends Fruit implements SeedRemovable {
    private boolean hasSeeds;

    public Apple(double weight, double sugarContent, double waterContent, Color color, boolean hasSeeds) {
        super(weight, sugarContent, waterContent, color);
        this.hasSeeds = hasSeeds;
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
