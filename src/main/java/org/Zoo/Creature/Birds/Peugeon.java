package org.Zoo.Creature.Birds;

import org.Zoo.Creature.Animals.Lion;

public class Peugeon extends Birds {

    public static void flyAwayScared(){
        Lion.roar();
        System.out.println("Haha he is terrified");
    }

    public static void doNothingButEat() {
        System.out.println("Those creatures are so boring - eating and doing nothing more");
    }
}
