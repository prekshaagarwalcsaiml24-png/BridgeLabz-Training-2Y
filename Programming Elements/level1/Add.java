import java.util.Scanner;

public class Add {
   public Add() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number: ");

      while(!sc.hasNextInt()) {
         System.out.println("Invalid input. Please enter an integer.");
         sc.next();
         System.out.print("Enter the first number: ");
      }

      int a = sc.nextInt();
      System.out.print("Enter the second number: ");

      while(!sc.hasNextInt()) {
         System.out.println("Invalid input. Please enter an integer.");
         sc.next();
         System.out.print("Enter the second number: ");
      }

      int b = sc.nextInt();
      int c = a + b;
      System.out.println("Addition of the two numbers = " + c);
      sc.close();
   }
}
