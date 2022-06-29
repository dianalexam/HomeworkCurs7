package com.fasttrackit;

public class Main {

    public static void main(String[] args) {

        // Person Exercise
        Person person1 = new Person("Diana Muresan", 29, true);
        Person person2 = new Person("George Muresan", 28, true);
        Person person3 = new Person("Mihai Pop", 27, false);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        //Product Exercise
        Product product1 = new Product("Bread", 7.5, 100, "Food");
        Product product2 = new Product("Toothpaste", 19.99, 90, "Personal Care");
        Product product3 = new Product("Sun cream", 28.99, 120, "Cosmetics");

        //Random examples in order to use all methods:
        //1
        System.out.println("You've bought the following items: " + product1.getName() + ", " + product2.getName() + ", " + product3.getName());
        System.out.println("Corresponding categories: " + product1.getCategory() + ", " + product2.getCategory() + ", " + product3.getCategory());
        System.out.println("Total amount to pay: " + (product1.getPrice() + product2.getPrice() + product3.getPrice()));

        //2
        System.out.println("Remaining quantities: " + product1.getName() + " - " + (product1.getQuantity() - 1));
        System.out.println("Remaining quantities: " + product2.getName() + " - " + (product2.getQuantity() - 1));
        System.out.println("Remaining quantities: " + product3.getName() + " - " + (product3.getQuantity() - 1));

        //3
        if (product3.hasStock()) {
            System.out.println("Current quantity: " + product3.getQuantity());
        } else {
            System.out.println("Not enough quantity on stock!");
        }

        //4
        if (product1.isCategory("Personal Care")) {
            System.out.println(product1.getName());
            System.out.println(product1.getQuantity());
        } else if (product1.isCategory("Cosmetics")) {
            System.out.println(product1.getName());
            System.out.println(product1.getQuantity());
        } else {
            System.out.println("This product is from a different category department");
        }

        //Bottle Exercise
        Bottle bottle = new Bottle();

        bottle.setTotalCapacity(250);
        bottle.setAvailableLiquid(300);
        System.out.println(bottle.openBottle());
        System.out.println(bottle.openBottle());
        System.out.println(bottle.closeBottle());
        System.out.println(bottle.closeBottle());

        if (bottle.checkIfLiquid()) {
            System.out.println(bottle.getAvailableLiquid());
        } else {
            System.out.println("No liquid in the bottle");
        }

        System.out.println(bottle.drinkLiquid(50));
        System.out.println(bottle.openBottle());
        System.out.println(bottle.drinkLiquid(250));
        //bottle.drinkLiquid(150);
        bottle.checkRemainingCapacity();
        System.out.println(bottle.getAvailableLiquid());
        bottle.setAvailableLiquid(250);
        System.out.println(bottle.getAvailableLiquid());
        System.out.println(bottle.checkIfLiquid());
        bottle.closeBottle();

    }
}
