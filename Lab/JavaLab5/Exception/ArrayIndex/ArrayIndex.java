import java.util.*;
/* Program to handle ArrayIndexOutOfBoundsException*/
public class ArrayIndex{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the element in an array: ");
        for(int i=0;i<array.length;i++){
            array[i] = in.nextInt();
        }
        
        System.out.print("Enter the index of array: ");
        int index = in.nextInt();
        try{
            System.out.println("The number at index " + index + " is " + array[index]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of range ");
        }
    }
}