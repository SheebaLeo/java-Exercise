package se.lexicon;

public class Car {
    String brand;
    String registrationNumber;
    int maxSpeed;
    String ownerName;
    String color;

    // Constructor to initialize the Car object
    public Car(String brand, String registrationNumber, int maxSpeed, String ownerName, String color) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.maxSpeed = maxSpeed;
        this.ownerName = ownerName;
        this.color = color;
    }

    // Getter and Setter methods for each attribute
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "ABC123", 180, "John Doe", "Red");

        // Printing the details of the Car object
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Registration Number: " + myCar.getRegistrationNumber());
        System.out.println("Max Speed: " + myCar.getMaxSpeed() + " km/h");
        System.out.println("Owner Name: " + myCar.getOwnerName());
        System.out.println("Color: " + myCar.getColor());
    }
}
