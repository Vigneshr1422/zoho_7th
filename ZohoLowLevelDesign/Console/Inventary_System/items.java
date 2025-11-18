package ZohoLowLevelDesign.Console.Inventary_System;

public class items {
    private static int counter = 1;  // Start from 1 or 0 as needed
    private int countId;
    private String name;
    private int quantity;
    private int price;

    public items(String name, int price, int quantity) {
        this.countId = counter++; // ✅ assign and then increment
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getCountId() {
        return countId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

//    public int getPrice() {
//        return price;
//    }

    public void setQuantity() {
        if (quantity > 0) quantity--;
    }

    public void display() {
        System.out.println("Product ID: " + countId + " | Product Name: " + name +
                " | Quantity: " + quantity + " | Price: " + price);
    }
}
