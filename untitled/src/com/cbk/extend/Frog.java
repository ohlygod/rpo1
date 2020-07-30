package com.cbk.extend;

public class Frog extends Animal implements Swimming{
    public void eat()
    {
        System.out.println("吃虫子");
    }
    public void swimming()
    {
        System.out.println("蛙泳");
    }
}
