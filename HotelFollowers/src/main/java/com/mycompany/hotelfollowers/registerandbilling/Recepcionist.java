/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.registerandbilling;

/**
 *
 * @author estudiantelis
 */
public class Recepcionist {
    
    private String name;
    private int id;
    private int phoneNumber;
    private String location;

    public Recepcionist() {
        
        name  = "";
        id = 0;
        phoneNumber = 0;
        location = "";
    }

    public Recepcionist(String name, int id, int phoneNumber, String location) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Recepcionist{" + "name: " + name + ", id: " + id + ", phone number: " 
                   + phoneNumber + ", location: " + location + '}';
    }
    
    public void checkRoomAvailability(){
        
    }
    
    public void bookRoom(){
        
    }
    
    public void generateBill(){
        
    }
    
    public void acceptCustomerFeedback(){
        
    }
      
    
}
