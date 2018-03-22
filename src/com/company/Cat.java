package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cat {
    public int health;
    public int damage;
    public int defence;
    public String name = new String("");
    public String special = new String("");


    Cat(ArrayList<String> catNames, ArrayList<String> specials) {
        Random random = new Random();
        this.health = 50 + random.nextInt(100);
        this.damage = 10 + random.nextInt(10);
        this.defence = random.nextInt(10);
        this.name = catNames.get(random.nextInt(catNames.size()));
        this.special = specials.get(random.nextInt(catNames.size()));
    }

    public void fight(Cat first, Cat second, Scanner scanner) throws InterruptedException {
        manifest(first);
        manifest(second);
        System.out.println(first.name + " and " + second.name + " are ready to fight!");
        scanner.nextLine();
        while (first.health > 0 && second.health > 0) {
            round(first, second);
            if (second.health > 0) {
                round(second, first);
                if (first.health == 0) {
                    System.out.println( first.name + " dies. " + second.name + " is winner!");
                    System.out.println();
                    break;
                }
            }
            else {
                System.out.println ( second.name + " dies. " + first.name + " is winner!");
                System.out.println();
                break;
            }
        }
        TimeUnit.SECONDS.sleep(2);
    }

    public static void round(Cat first, Cat second) throws InterruptedException {
        Random random = new Random();
        TimeUnit.SECONDS.sleep(2);
        if (random.nextInt(100) % (int)(first.health/15 + 1) == 0) {
            int currentDamage = first.damage + random.nextInt(40) + 10 - second.defence;
            second.health -= currentDamage;
            if (second.health < 0) {
                second.health = 0;
            }
            System.out.println(first.name + " with " + first.health + " HP points uses special " + first.special + " and strikes "
                    + second.name + " for " + currentDamage + " points. " + second.name + " is " +
                    second.health + " HP points healthy now.");
        } else {
            int currentDamage = first.damage + random.nextInt(10) - second.defence;
            second.health -= currentDamage;
            if (second.health < 0) {
                second.health = 0;
            }
            System.out.println(first.name + " with " + first.health + " HP points strikes "
                    + second.name + " for " + currentDamage + " points. " + second.name + " is " +
                    second.health + " HP points healthy now.");
        }
    }

    public static void manifest(Cat cat) {
       System.out.println("Name: " + cat.name);
       System.out.println("Special: " + cat.special);
       System.out.println("Damage: " + cat.damage);
       System.out.println("Defence: " + cat.defence);
       System.out.println("Health: " + cat.health + "\n");
    }
}
