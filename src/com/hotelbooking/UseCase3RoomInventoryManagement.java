package com.hotelbooking;

public class UseCase3RoomInventoryManagement {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display inventory
        inventory.displayInventory();

        System.out.println();

        // Check availability
        int available = inventory.getAvailability("Single Room");
        System.out.println("Single Room Available: " + available);

        // Update availability after booking
        inventory.updateAvailability("Single Room", available - 2);

        System.out.println("\nAfter Booking 2 Single Rooms:");

        // Display updated inventory
        inventory.displayInventory();
    }
}