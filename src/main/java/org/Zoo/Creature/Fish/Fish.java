package org.Zoo.Creature.Fish;

import org.Zoo.Creature.CreatureFeature;
import org.Zoo.Creature.Creature;

public class Fish extends Creature implements CreatureFeature {

    @Override
    public void breathe() {
        System.out.println("It breathes in the water");
    }

    @Override
    public void move() {
        System.out.println("It moves in the water");
    }
}
