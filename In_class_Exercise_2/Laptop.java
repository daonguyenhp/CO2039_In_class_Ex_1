// package In_class_Exercise_2;

public class Laptop {
    private String brand;
    private String model;
    private double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Laptop() {
        this("Unknown Brand", "Unknown Model", 0.0); 
        System.out.println("-> Default constructor triggered chaining.");
    }

    // Main function
    public static void main(String[] args) {
        System.out.println("--- Creating object 1 (Default) ---");
        Laptop lap1 = new Laptop(); 
        System.out.println("Brand: " + lap1.brand + ", Model: " + lap1.model + ", Price: $" + lap1.price);

        System.out.println("\n--- Creating object 2 (Parameterized) ---");
        Laptop lap2 = new Laptop("Dell", "XPS 15", 1500.00);
        System.out.println("Brand: " + lap2.brand + ", Model: " + lap2.model + ", Price: $" + lap2.price);
    }
}