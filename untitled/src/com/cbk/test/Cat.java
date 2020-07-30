package com.cbk.test;

public class Cat implements Jumpping {
    @Override
    public void jump() {
        System.out.println("猫跳");
        }
        class SmallCat{
            public void show(){
                System.out.println("内部类方法");
        }
    }
}
