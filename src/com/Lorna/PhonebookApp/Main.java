package com.Lorna.PhonebookApp;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void InitialMenu() {
        System.out.println("Please select one \n\t 1.Manage contacts" +
                "\n\t 2.Messages" +
                "\n\t 3.Quit");
    }

    public static void ManaageContactsMenu() {
        System.out.println("Please choose one \n\t1.Show all contacts \n\t 2." +
                "Add new contact " +
                "\n\t 3.Search for contact " +
                "\n\t Delete contact " +
                "\n\t %.Go back");
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
                DeleteCoontact();
                break;
            default:
                InitialMenu();
                break;
        }
    }

    private static void DeleteCoontact() {

    }

    private static void SearchForContact() {

    }

    private static void AddNewContact() {

    }

    private static void ShowAllContacts() {

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
        public static void main (String []args){
            scanner = new Scanner(System.in);
            InitialMenu();
            int userchoice = scanner.nextInt();
            switch (userchoice) {

                case 1:
                    ManaageContactsMenu();
                    break;
                case 2:
                    MessageMenu();
                    break;
                default:
                    break;
            }
        }


    private static void SendNewMessage() {
    }

    private static void ShowAllMessages() {


    }
}