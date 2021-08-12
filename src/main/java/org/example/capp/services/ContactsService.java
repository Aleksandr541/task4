package org.example.capp.services;

import org.example.capp.models.Contact;
import org.example.capp.models.ContactsList;

public interface ContactsService {

     void addContact(String name, String phone);
     void removeContact(int index);
     ContactsList<Contact> getAll();
     void searchContact(String name);
     ContactsList<Contact> filter(ContactsList<Contact> contactsList);
}
