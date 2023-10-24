public class Banana extends Fruit implements Peelable {
    private boolean hasPeel = true;

    public Banana(double weight, double sugarContent, double waterContent, Color color) {
        super(weight, sugarContent, waterContent, color);
    }

    @Override
    public void peelOff() {
        hasPeel = false;
    }

    @Override
    public boolean hasPeel() {
        return hasPeel;
    }
}
