package homework15b;

import java.util.Scanner;

public class Homework15b {

    public static void main(String[] args) {
        System.out.println("type in how many chickens you have per hecter");
        Scanner SC = new Scanner(System.in);
        double chicken = SC.nextInt();
      if (chicken<=10000){
          System.out.println("Free-range");
          if (chicken<=1500){
             System.out.println("dam your chickens are happy");
          }
      }
      else if(chicken>10000)
      {
        System.out.println("NOT Free-range");
      }
     
    }
} 
