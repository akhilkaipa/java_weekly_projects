class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }

    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void delivery(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    public void sell(int amount) {
        if (amount > 0 && this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough cars in stock to sell.");
        }
    }

    @Override
    public String toString() {
        return "Car Details: " +
                "\nModel: " + model +
                "\nBrand: " + brand +
                "\nYear: " + year +
                "\nPrice: $" + price +
                "\nColor: " + color +
                "\nQuantity: " + quantity;
    }
}

public class carinfo {
    public static void main(String[] args) {
        Car myCar = new Car("Model S", "Tesla", 2023, 79999.99, "Red", 10);

        System.out.println(myCar.toString());

        myCar.sell(2);
        System.out.println("\nAfter selling 2 cars:");
        System.out.println("Quantity: " + myCar.getQuantity());

        myCar.setColor("Blue");
        myCar.setPrice(74999.99);

        System.out.println("\nAfter modifying color and price:");
        System.out.println(myCar.toString());
    }
}
