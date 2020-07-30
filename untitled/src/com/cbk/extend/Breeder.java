package com.cbk.extend;

public class Breeder {
    public void breed(Animal animal){
        animal.drink();
        animal.eat();

        if(animal instanceof Frog)
        {
            ((Frog)animal).swimming();
        }
        if(animal instanceof Dog)
        {
            ((Dog)animal).swimming();
        }
    }
}
