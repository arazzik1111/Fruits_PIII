public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        Fruit[] fruits = app.readFruit();
        app.prepareFruit(fruits);
        app.outputFruitInfo(fruits);
     }
}
