package ZohoLowLevelDesign.Console.Inventary_Management_System;
import java.util.*;
public class Inventory {
    List<Item> items = new ArrayList<>();

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
        System.out.println("Item added successfully.");
    }

    public void viewAll() {
        if (items.isEmpty()) {
            System.out.println("No items available.");
            return;
        }
        for (Item item : items) {
            item.display();
        }
    }

    public boolean deleteItem(int id) {
        Iterator<Item> it = items.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Item deleted.");
                return true;
            }
        }
        System.out.println("Item not found.");
        return false;
    }

    public Item searchById(int id) {
        for (Item item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    public boolean buyItem(int id) {
        Item item = searchById(id);
        if (item != null && item.getQuantity() > 0) {
            item.reduceQuantity();
            System.out.println("Purchase successful!");
            return true;
        }
        System.out.println("Item out of stock or not found.");
        return false;
    }
}