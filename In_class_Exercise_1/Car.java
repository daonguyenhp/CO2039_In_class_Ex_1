package In_class_Exercise_1;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2026;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() { return brand; }

    public String getModel() { return model; }

    public int getYear() { return year; }

    public void setBrand(String b) { this.brand = b; }

    public void setModel(String m) { this.model = m; }

    public void setYear(int y) { this.year = y; }

    public static void main(String[] args) {
        // Create an object using the default constructor and display its details.
        Car car1 = new Car();
        System.out.println("Brand: " + car1.getBrand() + ", Model: " + car1.getModel() + ", Year: " + car1.getYear());

        // Create object using parameterized constructor
        Car car2 = new Car("Toyota", "Camry", 2024);
        System.out.println("Brand: " + car2.getBrand() + ", Model: " + car2.getModel() + ", Year: " + car2.getYear());
    }
}
