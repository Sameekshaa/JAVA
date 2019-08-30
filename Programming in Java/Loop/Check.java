import java.util.*;
class Check {
    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        if (a%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
