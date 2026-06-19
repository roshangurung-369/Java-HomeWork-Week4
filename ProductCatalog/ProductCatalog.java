class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {

    private int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

class Clothing extends Product {

    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

class Grocery extends Product {

    private String expiryDate;

    public Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {

        Product p1 = new Electronics("Laptop", 1200, 2);
        Product p2 = new Clothing("T-Shirt", 25, "M", "Cotton");
        Product p3 = new Grocery("Milk", 3, "2026-01-10");

        System.out.println("=== Electronics ===");
        p1.displayDetails();

        System.out.println("\n=== Clothing ===");
        p2.displayDetails();

        System.out.println("\n=== Grocery ===");
        p3.displayDetails();
    }
}