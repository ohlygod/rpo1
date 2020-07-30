package com.cbk.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //method();
        FileOutputStream outputStream=new FileOutputStream("F:\\workspace2\\fuck\\shit.txt");
        outputStream.write('a');
        outputStream.close();
    }

    public static void method(){
        new Inter(){
            @Override
            public void ddd() {
                System.out.println("ddd");
            }
        }.ddd();
    }
}
