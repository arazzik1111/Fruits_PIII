public abstract class Fruit {
    private double weight;
    private double sugarContent;
    private double waterContent;
    private Color color;
    private boolean peeled;
    private boolean seedsRemoved;

    public Fruit(double weight, double sugarContent, double waterContent, Color color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
        this.peeled = false;        // Initially, the fruit is not peeled.
        this.seedsRemoved = false;  // Initially, seeds are not removed.
    }
    public boolean Peeled_after(){
        return peeled;
    }
    public boolean SeedsRemoved_after(){
        return seedsRemoved;
    }
    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public double getWaterContent() {
        return waterContent;
    }

    public Color getColor() {
        return color;
    }

    public boolean isPeeled() {
        return peeled;
    }

    public boolean areSeedsRemoved() {
        return seedsRemoved;
    }

    @Override
    public String toString() {
        String status = "Status: ";
        if (peeled) {
            status += "Peeled";
        } else {
            status += "Not Peeled";
        }
        status += " / ";
        if (seedsRemoved) {
            status += "Seeds Removed";
        } else {
            status += "Seeds Not Removed";
        }

        return "Weight: " + weight + "g, Sugar Content: " + sugarContent + "g, Water Content: " + waterContent + "g, Color: " + color + ", " + status;
    }
}
