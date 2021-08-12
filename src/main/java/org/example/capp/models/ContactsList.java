package org.example.capp.models;

import org.example.capp.exceptions.IncorrectDataException;

import java.util.Arrays;
import java.util.Iterator;

public class ContactsList<T> implements Iterable<T> {

    private final int STEP = 8;
    private int _size=0;
    private Contact[] list = new Contact[_size];

    public Contact[] getList() {
        return list;
    }

    public Contact get(int index) {
        return (Contact) list[index];
    }

    public int size() {
       return _size;
    }

    public void remove(int index) {
        if(index < 0 || index > list.length-1){
            throw new IncorrectDataException("Incorrect index!");
        }

        if(list.length == 1){
            list = null;
        }else {
            Contact[] newList = new Contact[list.length - 1];
            if (index == 0) {
                System.arraycopy(list, 1, newList, 0, list.length);
            } else if (index == list.length - 1) {
                System.arraycopy(list, 0, newList, 0, list.length - 1);
            } else {
                System.arraycopy(list, 0, newList, 0, index);
                System.arraycopy(list, index + 1, newList, index, list.length - index - 1);
            }
            list = newList;
        }
        _size--;
    }

    public <T> void add(T contact) {
        if (_size == 0) {
            list = new Contact[_size + 1];
        } else {
            list = Arrays.copyOf(list, _size + 1);
        }
        list[_size] = (Contact) contact;
        _size++;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
