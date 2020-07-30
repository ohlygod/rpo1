package com.cbk.test3;

public class Rabbit extends Herbivore{

    public Rabbit() {
        super();
    }

    public Rabbit(Integer age, Integer numOfLegs) {
        super(age, numOfLegs);
    }

    @Override
    void eat() {
        System.out.println("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿兔子在吃奥利给");
    }
}
