package com.cbk.day05.Third;

import java.io.*;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws IOException {
        /*ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("a",10,"male"));
        students.add(new Student("b",12,"male"));
        students.add(new Student("c",99,"male"));
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Iterator it=students.iterator();
        while (it.hasNext())
        {
            Object object=it.next();
            System.out.println(object);
        }*/
        copyImg();
    }

    public static void readFile() throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("fuck\\shit.txt"));
        byte[] bys=new byte[1024];
        int ch;
        while ((ch=bis.read(bys))!=-1)
        {
            System.out.println((char)ch);
        }
        bis.close();
    }
    public static void copyImg() throws IOException {
        FileInputStream fi=new FileInputStream("F:\\workspace2\\fuck\\shit.txt");
        FileOutputStream fo=new FileOutputStream("F:\\workspace2\\fuck\\fuck.txt");
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fi.read(bytes))!=-1)
        {
            fo.write(bytes,0,len);
        }
        fo.close();
        fi.close();
    }
}
