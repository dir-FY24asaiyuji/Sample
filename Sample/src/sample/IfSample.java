package sample;

import java.awt.datatransfer.SystemFlavorMap;

public class IfSample {

    public static void main(String[] args) {
       var score=80;
       if (score>=60) {
           System.out.println("合格です!");
       }
       var score2=50;
       if (score2>=60) {
           System.out.println("合格です！");
}else {
    System.out.println("赤点です。。。");  
}
    
       var score3=100;
       if (score3==100) {
        System.out.println("満点です!");
        
    }else if (score3>=80) {
        System.out.println("よくできました!");
    } else if (score3>=60) {
            System.out.println("合格です!");
    }else {
        System.out.println("赤点です!");
    }        
        }
       
       

    }

