import java.util.*;
class SumOfJaggedArray{
  public static void main(String[]args){
      int a[][] = new int[3][];
      int a[0] = new int[5];
      int a[1] = new int[3];
      int a[2] = new int[2];
      int integer = 0;
      Scanner input = new Scanner (System.in);
      for (int i=0; i<3; i++){
        for (int j=0; j<a[i]; j++){
            a[i][j] = input.nextInt();
            integer += a[i][j];
        }
      }
      System.out.println("Sum : " + integer);
  }
}