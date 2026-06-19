class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayMenuItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Pizza extends FoodItem {

    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("=== Pizza ===");
        super.displayMenuItem();
        System.out.println("Size: " + size);

        System.out.print("Toppings: ");
        for (String t : toppings) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

class Burger extends FoodItem {

    private String cheese;
    private String pattyType;

    public Burger(String name, double price, String cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("=== Burger ===");
        super.displayMenuItem();
        System.out.println("Cheese: " + cheese);
        System.out.println("Patty Type: " + pattyType);
    }
}

class Salad extends FoodItem {

    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("=== Salad ===");
        super.displayMenuItem();

        System.out.print("Ingredients: ");
        for (String i : ingredients) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {

        FoodItem[] menu = {
                new Pizza("Veg Pizza", 500, "Large", new String[]{"Cheese", "Olives", "Tomato"}),
                new Burger("Chicken Burger", 250, "Cheddar", "Grilled Chicken"),
                new Salad("Healthy Salad", 200, new String[]{"Lettuce", "Cucumber", "Carrot"})
        };

        for (FoodItem item : menu) {
            item.displayMenuItem();
            System.out.println();
        }
    }
}