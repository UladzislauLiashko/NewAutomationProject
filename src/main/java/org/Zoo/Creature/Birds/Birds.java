package org.Zoo.Creature.Birds;

import org.Zoo.Creature.CreatureFeature;
import org.Zoo.Creature.Creature;

public class Birds extends Creature implements CreatureFeature {

    @Override
    public void breathe() {
        System.out.println("It breathes in the air");
    }

    @Override
    public void move() {
        System.out.println("It moves in the air, it flies");
    }
}
