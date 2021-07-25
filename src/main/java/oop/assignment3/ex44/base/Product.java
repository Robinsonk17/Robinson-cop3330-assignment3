package oop.assignment3.ex44.base;

// This class represents a singular product.
public class Product {
    private int quantity;
    private double price;
    private String name;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Return the price to output to user.
    public double getPrice() {
        return price;
    }

    // Return the quantity to output to user.
    public int getQuantity() {
        return quantity;
    }

    // Return the name to output to user.
    public String getName() {
        return name;
    }
}
