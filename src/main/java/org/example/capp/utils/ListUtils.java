package org.example.capp.utils;

import org.example.capp.models.ContactsList;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ListUtils {


    public static <T> void forEach(ContactsList<T> arr, Consumer<T> elemProcessor) {
        for (T elem : arr) {
            elemProcessor.accept(elem);
        }

    }

    public static <T> ContactsList<T> filter(ContactsList<T> arr, Predicate<T> predicate) {
        ContactsList<T> result = new ContactsList<>();
        for (T elem : arr) {
            if (predicate.test(elem)) {
                result.add(elem);
            }
        }
        return result;
    }



    public static <T, R> R reduce(ContactsList<T> list, R initValue, BiFunction<R, T, R> f) {
        for (T elem : list) {
            initValue = f.apply(initValue, elem);
        }
        return initValue;
    }

    public static <T> boolean anyMatch(ContactsList<T> arr, Predicate<T> predicate) {
        for (T elem : arr) {
            if (predicate.test(elem)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean allMatch(ContactsList<T> arr, Predicate<T> predicate) {

        for (T elem : arr) {
            if (!predicate.test(elem)) {
                 return false;
            }
        }
        return true;
    }

    public static <T, R> ContactsList<R> map(ContactsList<T> arr, Function<T, R> listR) {
        ContactsList<R> list2 = new ContactsList<>();
        for (T elem : arr) {
            list2.add(listR.apply(elem));
        }
        return list2;
    }
}
