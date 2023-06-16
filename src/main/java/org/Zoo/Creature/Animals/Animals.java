package org.Zoo.Creature.Animals;

import org.Zoo.Creature.CreatureFeature;
import org.Zoo.Creature.Creature;

public class Animals extends Creature implements CreatureFeature {

    @Override
    public void breathe() {
        System.out.println("It breathes with lungs");
    }

    @Override
    public void move() {
        System.out.println("It moves on the ground");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}