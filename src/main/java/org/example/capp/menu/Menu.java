package org.example.capp.menu;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuAction> items;
    private Scanner sc;

    public Menu(Scanner sc, List<MenuAction> items) {
        this.items = items;
        this.sc = sc;
    }

    private void printItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, items.get(i).getName());
        }
        System.out.printf("%d - exit\n", items.size() + 1);
    }

    private int getChoice() {
        System.out.print("Enter yor choice:");
        int ch = sc.nextInt();
        return ch - 1;
    }

    public void run() {
        while (true) {
            printItems();
            int ch = getChoice();
            if (ch < 0 || ch > items.size()) {
                System.out.printf("Incorrect input");
                continue;
            }
            if (ch == items.size()) break;

            items.get(ch).doAction();
        }
    }

}

