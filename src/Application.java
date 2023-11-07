import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public Fruit[] readFruit() {
        System.out.print("Enter the number of fruits: ");
        int numFruits = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Fruit[] fruits = new Fruit[numFruits];
        for (int i = 0; i < numFruits; i++) {
            System.out.println("Enter details for Fruit " + (i + 1));
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            System.out.print("Sugar Content: ");
            double sugarContent = scanner.nextDouble();
            System.out.print("Water Content: ");
            double waterContent = scanner.nextDouble();
            System.out.print("Color (RED, YELLOW, PURPLE, etc.): ");
            String color = scanner.next();
            Color fruitColor = Color.valueOf(color); // Assuming Color is an enum

            System.out.print("Is it a Banana? (yes/no): ");
            boolean isBanana = scanner.next().equalsIgnoreCase("yes");

            if (isBanana) {
                fruits[i] = new Banana(weight, sugarContent, waterContent, fruitColor);
            } else {
                System.out.print("Does it have seeds? (yes/no): ");
                boolean hasSeeds = scanner.next().equalsIgnoreCase("yes");
                fruits[i] = new Apple(weight, sugarContent, waterContent, fruitColor, hasSeeds);
            }
        }

        return fruits;
    }

    public void prepareFruit(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Peelable) {
                Peelable peelableFruit = (Peelable) fruit;
                peelableFruit.peelOff();
                fruit.peeled = true; // Update the status
            }
            if (fruit instanceof SeedRemovable) {
                SeedRemovable seedRemovableFruit = (SeedRemovable) fruit;
                seedRemovableFruit.removeSeeds();
                fruit.seedsRemoved = true; // Update the status
            }
        }
    }


    public void outputFruitInfo(Fruit[] fruits) {
        System.out.println("Fruit Information:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.toString());
        }
    }
}
