/*Create an interface Calculation with two methods.
    int add (int a, int b)
    int multiply (int a , int b)
Create a class CalculationDemo that implements above interface.
Provide a test class. */
interface Calculation{
    int add (int a, int b);
    int multiply (int a , int b);
}
class CalculationDemo implements Calculation{
    public int add(int a, int b){
        int c = a +b;
        return c;
    }
    public int multiply(int a, int b){
        int c = a*b;
        return c;
    }
}
public class InterfaceCalc{
    public static void main(String[]args){
        CalculationDemo obj = new CalculationDemo();
       int c= obj.add(5,3);
        System.out.println("add : " + c);
        int d=obj.multiply(2,3);
        System.out.println("multiply : " + d);

    }
}