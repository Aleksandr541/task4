package org.example.capp;

import org.example.capp.menu.Menu;
import org.example.capp.menu.MenuAction;
import org.example.capp.menu.item.AddContactMenuAction;
import org.example.capp.menu.item.ReadAllContact;
import org.example.capp.menu.item.RemoveContactMenuAction;
import org.example.capp.menu.item.SearchingForContact;
import org.example.capp.services.ContactsService;
import org.example.capp.services.InMemoryContactService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContactsService contactsService = new InMemoryContactService();

        List<MenuAction> item = Arrays.asList(
                new AddContactMenuAction(contactsService, sc),
                new ReadAllContact(contactsService),
                new RemoveContactMenuAction(contactsService,sc),
                new SearchingForContact(contactsService, sc)
        );
        Menu menu = new Menu(sc, item);
        menu.run();

    }
}
