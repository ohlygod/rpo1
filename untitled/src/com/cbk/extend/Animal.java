package com.cbk.extend;

public class Animal {
    public int age;

    public Animal()
    {}

    public Animal(int age) {
        this.age = age;
    }

    public void eat(){}

    public void drink(){
        System.out.println("喝水");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
