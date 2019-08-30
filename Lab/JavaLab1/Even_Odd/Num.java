import java.util.*;
class Num{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter a number : ");
    int a = input.nextInt();
    if (a % 2 == 0){
      System.out.println("This is an Even Number.");
    }
    else{
      System.out.println("This is a Odd Number");
    }

  }
}