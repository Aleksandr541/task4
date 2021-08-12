package org.example.capp.menu.item;

import lombok.RequiredArgsConstructor;
import org.example.capp.menu.MenuAction;
import org.example.capp.services.ContactsService;

import java.util.Scanner;

@RequiredArgsConstructor
public class RemoveContactMenuAction implements MenuAction {
    private final ContactsService contactsService;
    private final Scanner sc;

    @Override
    public void doAction() {

        System.out.println("Enter the index of contact that should be removed:");
        int index = sc.nextInt();
        contactsService.removeContact(index);
        System.out.println("Contact has been removed");
        sc.nextLine();

    }

    @Override
    public String getName() {
        return "Remove contact";
    }

}
