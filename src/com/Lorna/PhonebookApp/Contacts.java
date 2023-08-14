package com.Lorna.PhonebookApp;

import java.util.ArrayList;

public class Contacts {
 private  String name;
 private String phoneNumber;
 private String email;
 ArrayList<Messages> message;

    public Contacts(String name, String phoneNumber, String email, ArrayList<Messages> message) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.message = message;
    }

    public Contacts(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.message=new ArrayList<>();
    }

    public String getName() {
        return name;
    }
     public void getDetails(){
         System.out.println("Name " + name + "\n PhoneNumber "+ phoneNumber +"\n email" +email);
     }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Messages> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Messages> message) {
        this.message = message;
    }
}
