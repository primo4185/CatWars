package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> catNames = new ArrayList<String>();
    static ArrayList<String> specials = new ArrayList<String>();

    public static void namesListFill() {
        catNames.add("Ashes");
        catNames.add("Tiger");
        catNames.add("Puss");
        catNames.add("Smokey");
        catNames.add("Misty");
        catNames.add("Kitty");
        catNames.add("Oscar");
        catNames.add("Felix");
        catNames.add("Shashlik");
        catNames.add("Kebab");
    }

    public static void specialsFill() {
        specials.add("Fireball");
        specials.add("Ignite");
        specials.add("Exhaust");
        specials.add("Kiss");
        specials.add("Lightning");
        specials.add("Thunderbolt");
        specials.add("Firestorm");
        specials.add("Bloodlust");
        specials.add("Wildcall");
        specials.add("Stormpunch");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        namesListFill();
        specialsFill();
        Cat jugde = new Cat(catNames, specials);
        for (int i = 0; i < 10; i++) {
            Cat cat1 = new Cat(catNames, specials);
            Cat cat2 = new Cat(catNames, specials);
            scanner.nextLine();
            try {
                jugde.fight(cat1, cat2, scanner);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }


    }
}
