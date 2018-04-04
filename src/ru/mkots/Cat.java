package ru.mkots;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cat {

    static List<String> catNames = Arrays.asList(
            "Ashes",
            "Tiger",
            "Puss",
            "Smokey",
            "Misty",
            "Kitty",
            "Oscar",
            "Felix",
            "Shashlik",
            "Kebab"
    );

    static List<String> specials = Arrays.asList(
            "Fireball",
            "Ignite",
            "Exhaust",
            "Kiss",
            "Lightning",
            "Thunderbolt",
            "Firestorm",
            "Bloodlust",
            "Wildcall",
            "Stormpunch"
    );


    public int health;
    public int damage;
    public int defence;
    public String name = new String("");
    public String special = new String("");


    Cat() {
        Random random = new Random();
        this.health = 50 + random.nextInt(100);
        this.damage = 10 + random.nextInt(10);
        this.defence = random.nextInt(10);
        this.name = catNames.get(random.nextInt(catNames.size()));
        this.special = specials.get(random.nextInt(catNames.size()));
    }
}
