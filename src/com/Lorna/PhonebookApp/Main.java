package com.Lorna.PhonebookApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static  ArrayList<Contacts> contacts;
    private static int id;

    public static void InitialMenu() {
        System.out.println("Please select one \n\t 1.Manage contacts" +
                "\n\t 2.Messages" +
                "\n\t 3.Quit");
        int userchoice = scanner.nextInt();
        switch (userchoice) {

            case 1:
                ManageContactsMenu();
                break;
            case 2:
                MessageMenu();
                break;
            default:
                break;
        }

    }

    public static void ManageContactsMenu() {
        System.out.println("Please choose one  \n\t 1.Show all contacts \n\t 2." +
                "Add new contact " +
                "\n\t 3.Search for contact " +
                "\n\t 4.Delete contact " +
                "\n\t 5.Go back");
        int userchoice = scanner.nextInt();
        switch (userchoice) {
            case 1:
                ShowAllContacts();
                break;
            case 2:
                AddNewContact();
                break;
            case 3:
                SearchForContact();
                break;
            case 4:
                DeleteContact();
                break;
            default:
                InitialMenu();
                break;
        }
    }

    private static void DeleteContact() {
        System.out.println("Please enter name of the contact you want to delete");
        String name=scanner.next();
        if(name.equals("")){
            DeleteContact();
        }
        else{
            for(Contacts c: contacts){
                if(c.getName().equals(name)){
                    contacts.remove(c);
                    System.out.println("Contact succesfully deleted ");
                }
                else{
                    System.out.println("Contact does not exist");
                }
            }
        }
        ManageContactsMenu();
    }

    private static void SearchForContact() {
        System.out.println("Please enter name of the contact you are searching for");
        String name=scanner.next();
        if(name.equals("")){
            SearchForContact();
        }
        else{
            for(Contacts c: contacts){
                 if(c.getName().equals(name)){
                    c.getDetails();
                 }
                 else{
                     System.out.println("Contact does not exist");
                 }
            }
        }
        ManageContactsMenu();
    }

    private static void AddNewContact() {
        System.out.println("Enter the name of new contact to add");
          String newContact=scanner.next();
        System.out.println("Enter the  contacts number");
          String number =scanner.next();
        System.out.println("Enter the contacts email");
           String email= scanner.next();

           if(newContact.equals("")|| number.equals("")||email.equals("")){
               System.out.println("Please enter all the required fields");
               AddNewContact();
           }
           else{
               for(Contacts c:contacts){
                   if(c.getName().equals(newContact)){
                       System.out.println("The contact already exists");
                       AddNewContact();
                   }else{
                       System.out.println("Adding new contact ....");
                       Contacts contact=new Contacts(newContact,number,email);
                       contacts.add(contact);
                       System.out.println("Contact successfully saved");
                   }
               }
           }
           ManageContactsMenu();
    }

    private static void ShowAllContacts() {
        if(contacts.size()>0) {
            for (Contacts c : contacts) {
                c.getDetails();
                System.out.println("###################");
            }

        }else{
            System.out.println("No contact has been saved yet");
        }
        ManageContactsMenu();
    }

    public static void MessageMenu() {
        System.out.println("Please select one \n\t 1.See all messages" +
                "\n\t 2.Send new message" +
                "\n\t 3.Go back");
        int userchoice = scanner.nextInt();
        switch (userchoice) {
            case 1:
                ShowAllMessages();
                break;
            case 2:
                SendNewMessage();
                break;
            default:
                InitialMenu();
                break;

        }
    }
        public static void main (String []args) {
            contacts = new ArrayList<>();
            scanner = new Scanner(System.in);
            id = 0;
            InitialMenu();

        }


    private static void SendNewMessage() {
        System.out.println("Enter a name you want to send message to");
        String name=scanner.next();
        if(name.equals("")){
            SendNewMessage();
        }else {
            boolean doesExist = false;
            for (Contacts c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    break;
                }
            }
            if (doesExist) {
                System.out.println("Enter the message to send");
                String messageToSend = scanner.next();
                if (messageToSend.equals("")) {
                    SendNewMessage();
                } else {
                    id++;
                    Messages message = new Messages(messageToSend, name, id);
                    for (Contacts c : contacts) {
                        if (c.getName().equals(name)) {
                            ArrayList<Messages> newMessages = c.getMessage();
                            newMessages.add(message);
                            Contacts current = c;
                            current.setMessage(newMessages);
                            contacts.remove(c);
                            contacts.add(current);
                        }
                    }
                }
            }else {
                System.out.println("The contact does not exist");
            }
        }
         InitialMenu();
        }

    private static void ShowAllMessages() {

         ArrayList<Messages> allMessages=new ArrayList<>();
        for(Contacts c:contacts){
            allMessages.addAll(c.getMessage());

            if(allMessages.size()>0){
                for(Messages m:allMessages){
                    m.getDetails();
                    System.out.println("###################");
                }
            }else {
                System.out.println("You  have mo messages");
            }
        }

    }
}