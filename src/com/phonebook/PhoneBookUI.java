package com.phonebook;

import java.util.Scanner;

public class PhoneBookUI {

    public static void welcome() {
        System.out.println("Welcome to your phonebook");
        options();
    }

    static void options() {
        helpCommands();
        
        String userOptionInput;
        Scanner userInput = new Scanner(System.in);
        userOptionInput = userInput.next();

        while (true) {
            if (userOptionInput.equals("a")) {
                String phoneNum, contactName;
                PhoneBookContact.addContact(phoneNum, contactName);
            }
            else if (userOptionInput.equals("s")) {
                PhoneBookContact.searchContacts();
            }
            else if (userOptionInput.equals("r")) {
                PhoneBookContact.removeContact();
            }
            else if (userOptionInput.equals("*")) {
                PhoneBookContact.viewAllContacts();
            }
            else if (userOptionInput.equals("h")) {
                helpCommands();
            }
            else if (userOptionInput.equals("e")) {
                //exit
                System.out.println("Terminating the program.");
                break;
            }

        }

    }

    private static void helpCommands() {
        System.out.println("Please select from the following options:");
        System.out.println("'a' - Add a new contact to your phonebook");
        System.out.println("'s' - Bring up the search by name feature");
        System.out.println("'r' - Remove a contact from your phonebook");
        System.out.println("'*' - View all contacts in your phonebook");
        System.out.println("'h' - Help. Shows list of all commands.");
        System.out.println("'e' - Exit.");
    }

}
