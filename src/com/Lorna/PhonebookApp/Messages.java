package com.Lorna.PhonebookApp;

public class Messages {
   private String messageText;
    private String recepientName;
    private int id;  // Trying to simulate unique id as in database

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getRecepientName() {
        return recepientName;
    }

    public void setRecepientName(String recepientName) {
        this.recepientName = recepientName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Messages(String messageText, String recepientName, int id) {
        this.messageText = messageText;
        this.recepientName = recepientName;
        this.id =id;
    }

    public void getDetails(){
        System.out.println("Message of id "+ id +"is " + messageText + "to contact" +recepientName);
    }
}
