package com.cbk.extend;

public class Dog extends Animal implements Swimming{
    public void eat()
    {
        System.out.println("吃骨头");
    }
    public void swimming()
    {
        System.out.println("狗游泳");
    }
}
