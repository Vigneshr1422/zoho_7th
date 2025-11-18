package ZohoLowLevelDesign.Console.Inventary_Management_System;

public class Item {

    private static int counter = 100;
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity() {
        this.quantity--;
    }

    public void display() {
        System.out.println(id + " | " + name + " | Rs." + price + " | Qty: " + quantity);
    }
}