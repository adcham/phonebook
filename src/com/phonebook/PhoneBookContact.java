package com.phonebook;

import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookContact {
    static Map<String, String> contact = new HashMap<>();


    static void viewAllContacts() {
    }

    static void removeContact() {
    }

    static void searchContacts() {
    }

    public static void addContact(String phoneNum, String contactName) {
        contact.put(phoneNum,contactName);
    }
}
