package com.cbk.test3;

public abstract class Animal {
    private Integer age;
    private Integer numOfLegs;

    abstract void eat();

    public Animal() {}
    public Animal(Integer age, Integer numOfLegs) {
        this.age = age;
        this.numOfLegs = numOfLegs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(Integer numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
