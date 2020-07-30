package com.cbk;

public class test {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.setName("卧槽");
        thread.start();
        for(int i=0;i<20;i++)
        {
            System.out.println();
        }
    }
}
