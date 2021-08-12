package org.example.capp.menu.item;

import lombok.RequiredArgsConstructor;
import org.example.capp.menu.MenuAction;
import org.example.capp.services.ContactsService;

import java.util.Scanner;

@RequiredArgsConstructor
public class SearchingForContact implements MenuAction {
    private final ContactsService contactsService;
    private final Scanner sc;

    @Override
    public void doAction() {
        sc.nextLine();
        System.out.printf("Enter the contact name:\n");
        String name = sc.nextLine();
        System.out.printf("Contact searching...");
        contactsService.searchContact(name);
    }

    @Override
    public String getName() {
        return "Searching for contact";
    }

}
