package com.cbk.test2;

import java.util.Scanner;

public class RemoteController {
    public void controlTV(TV tv){
        System.out.println("遥控器控制电视,请输入电视节目信息");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        tv.play(str);
    }
}
