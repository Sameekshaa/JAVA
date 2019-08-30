package Lab5.Exception.ArithmeticExp;

/*
    Program to input two integers from user and display the result after dividing. Also handling the ArithmeticException
*/
import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        try{
            int c = a / b;
            System.out.println(a +" / " +  b + " = " + c);
        }
        catch(ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }
    }
}