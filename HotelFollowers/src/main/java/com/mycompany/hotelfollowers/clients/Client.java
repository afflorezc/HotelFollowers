/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.clients;

/**
 *
 * @author estudiantelis
 */
public class Client {
    
    private String name;
    private int id;
    private int phoneNumber;
    private String address;
    private int roomNumber;

    public Client() {
        
        name = "";
        id = 0;
        phoneNumber = 0;
        address ="";
        roomNumber = 0;
    }

    public Client(String name, int id, int phoneNumber, String address, int roomNumber) {
        
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Client{" + "name: " + name + ", id: " + id + ", phone number: " + phoneNumber +
                   ", address: " + address + ", room number: " + roomNumber + '}';
    }
    
    public void checkIn(){
        
        
    }
    
    public void checkOut(){
        
    }
    
    public void payBill(){
        
    }
    
    public void orderFood(){
        
    }
    
    public void submitFeedback(String message, String date){
        
    }
    
    public void submitComplaint(String complaint, String date){
        
    }
   
}
