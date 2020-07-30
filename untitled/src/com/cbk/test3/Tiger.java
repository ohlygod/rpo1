package com.cbk.test3;

public class Tiger extends Carnivore{
    public Tiger() {
        super();
    }

    public Tiger(Integer age, Integer numOfLegs) {
        super(age, numOfLegs);
    }

    @Override
    void eat() {
        System.out.println("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿老虎在吃奥利给");
    }

}
