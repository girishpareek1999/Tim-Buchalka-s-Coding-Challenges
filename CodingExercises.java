
package codingexercises;

public class WhatTypeOfNumberItIs {
    
    public static void main(String[] args) {
        checkMain(0);
    }
     public static void checkMain(int number){
         if(number > 0)
             System.out.println("positive");
         else if(number < 0)
             System.out.println("negative");
         else if(number == 0)
             System.out.println("zero");
     }
    
}
