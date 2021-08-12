package org.example.capp.menu.item;

import lombok.RequiredArgsConstructor;
import org.example.capp.menu.MenuAction;
import org.example.capp.models.Contact;
import org.example.capp.models.ContactsList;
import org.example.capp.services.ContactsService;

@RequiredArgsConstructor
public class ReadAllContact implements MenuAction {
    private final ContactsService contactsService;


    @Override
    public void doAction() {
        System.out.printf("______________Contacts____________\n");
        ContactsList<Contact> all = contactsService.getAll();
        if (all.getList() == null){
            System.out.println("The list is empty");
        }else {
            for (Contact contact : all.getList()) {
                System.out.printf(
                        "Name:- %s Phone: - %s\n",
                        contact.getName(),
                        contact.getPhone());
            }
        }
        System.out.println("_________________________________");
    }

    @Override
    public String getName() {
        return "Read all contact";
    }

}