/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.registerandbilling;

/**
 *
 * @author estudiantelis
 */
public class Room {
    
    private int roomNumber;
    private String location;
    private int availability;
    private float dailyCost;

    public Room() {
    }

    public Room(int roomNumber, String location, int availability, float dailyCost) {
        this.roomNumber = roomNumber;
        this.location = location;
        this.availability = availability;
        this.dailyCost = dailyCost;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Room{" + "Room Number:" + roomNumber + ", Location=" + location + ", Availability=" + availability + '}';
    }
      
}
