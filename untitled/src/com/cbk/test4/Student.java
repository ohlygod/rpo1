package com.cbk.test4;

public class Student extends Person{
    @Override
    public void sleep() {
        System.out.println("年龄为"+super.getAge()+"的"+super.getName()+"学生正在睡午觉");
    }
}
