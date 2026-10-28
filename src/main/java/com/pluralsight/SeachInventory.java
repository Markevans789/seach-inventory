package com.pluralsight;
import jdk.incubator.vector.ByteVector;
import jdk.incubator.vector.DoubleVector;

import java.util.ArrayList;
// Starter for Search Inventory (Workbook 3a, Section 3-2 Using an ArrayList, Exercise 1).
// main is done: it asks getInventory() for the list and prints every product.
// Your job is getInventory(): fill the list with at least 5 products.
class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(4567, "10' 2x4", 9.99));
        inventory.add(new Product(1234, "Hammer", 19.49));
        inventory.add(new Product(2345, "Box of nail", 9.29));
        inventory.add(new Product(9154, "9-in-1 ratcheting screwdriver", 24.97));
        inventory.add(new Product(1648, "10 Crescent Wrench", 15.95));
        inventory.add(new Product(9876, "Mechanics Tool Set", 119.00));
        inventory.add(new Product(1212, "2 Spring Clamp", .99));
        inventory.add(new Product(3434, "Large Trigger Clamps", 36.97));
        return inventory;
    }
}

