package com.hotelbooking;

import java.util.ArrayList;

public class HotelManager {

    private ArrayList<Room> rooms = new ArrayList<>();

    public HotelManager() {

        // Will be used in UseCase2
        // rooms.add(new SingleRoom());
        // rooms.add(new DoubleRoom());
        // rooms.add(new SuiteRoom());

    }

    public void displayRooms() {

        for (Room room : rooms) {
            room.displayRoomDetails();
            System.out.println("---------------------");
        }

    }
}