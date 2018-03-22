package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sos");

        Scanner scanner = new Scanner(System.in);
        Cat jugde = new Cat();
        for (int i = 0; i < 10; i++) {
            Cat cat1 = new Cat();
            Cat cat2 = new Cat();
            scanner.nextLine();
            try {
                jugde.fight(cat1, cat2, scanner
                );
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }


    }
}
