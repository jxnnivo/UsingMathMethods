/*
Author: Jennifer Vo
Course: COP 2210
Date: 05/19/2024
Assignment: Using Math Methods
Instructor: Sergio Pisano
Description: Using math methods
*/
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      System.out.print(Math.pow(x, z) + " ");
      System.out.print(Math.pow(x, Math.pow(y, z)) + " ");
      System.out.print(Math.abs(y) + " ");
      System.out.println(Math.sqrt(Math.pow(x*y, z)));
   }
}
/* CODE FROM OUTPUT
3.6 4.5 2.0
12.96 1.841304610218211E11 4.5 16.2 
*/