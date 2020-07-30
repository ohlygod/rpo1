package com.cbk.extend;

public class Test {
    public static void main(String[] args) {
        Breeder breeder=new Breeder();

        breeder.breed(new Dog());
        breeder.breed(new Frog());
        breeder.breed(new Sheep());
    }
}
