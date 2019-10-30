/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daniel joseph
 */
public class Git {
    private int a,b,temp;
    private String ops;
  Scanner input = new Scanner(System.in);
   private void fillnumber(){

    Random var = new Random();
    a = var.nextInt(20);
    b = var.nextInt(20);
    if (a < b){

        temp= a;
        a=b;
        b=temp;
       
         int operator = var.nextInt(4);
           ops =operate(operator);
            System.out.println("what is: "+ a + ops + b);
            int x=input.nextInt();
            int y= compute(a,ops,b);
            if(x==y){
            System.out.println("Correct answer");
            }
            else{
            System.out.println("incorrectt answer");
            }
          
        
    }
   }
   private String operate (int p){
        String i =" ";
        if (p==0) i="+";
        if (p==1) i="-";
        if (p==2) i="/";
        if (p==3) i="*";
        return i;

}
   private int compute(int x, String z, int y){
        int result = 0;
        if (z.equals("+")) result = x+y;
        if (z.equals("-")) result = x-y;
        if (z.equals("*")) result = x*y;
        if (z.equals("/")) result = x/y;

            return result;

    }
    
    public static void main(String[] args) {
       // program to generate random numberst t
      System.out.println("** welcome to our guessing game **");
      System.out.println("Enter no of times you want to play");
      Scanner input = new Scanner(System.in);
      int g=input.nextInt();
      for (int i =0; i<=g; i++){
      Git game= new Git();
      game.fillnumber();
    
      }
    }
    
}
