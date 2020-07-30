package com.cbk.day05.First;

import java.util.*;

public class First {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list=new ArrayList<>();
        while (list.size()<10)
        {
            int temp=random.nextInt(100)+1;
            boolean flag=false;//判断生成数是否重复
            for(int j=0;j<list.size();j++)
            {
                if (list.get(j).equals(temp))
                    flag=true;
            }
            if(!flag)
                list.add(temp);
        }
        Integer[] arr=new Integer[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=list.get(i);
        }
        list.clear();
        for (int i=0;i<10;i++)
        {
            int key=arr[i];
            for (int j=i+1;j<10;j++)
            {
                int pos=i;
                if (arr[j]<key)
                {
                    pos=j;
                    key=arr[j];
                }
                int t=arr[i];
                arr[i]=key;
                arr[pos]=t;
            }
        }
        for (Integer i:arr)
        {
            list.add(i);
        }
        System.out.println(list);
    }
}
