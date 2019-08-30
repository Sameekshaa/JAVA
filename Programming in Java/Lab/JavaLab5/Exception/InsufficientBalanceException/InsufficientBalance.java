import java.util.Scanner;

/**
 * Create your own class "InsufficientBalanceException"
 * Create a class cusomer with name,acNum,balAmount
 * Provide a method void withdraw(double amount) that throws InsufficientBalanceException
 */
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Customer{
    String name,acNum;
    double balAmount;

    public Customer(String name, String acNum, double balAmount) {
        this.name = name;
        this.acNum = acNum;
        this.balAmount = balAmount;
    }
    void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acNum);
        System.out.println("Balance Amount: " + balAmount);
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balAmount){
            InsufficientBalanceException ex = new InsufficientBalanceException("Cannot withdraw that much ammount");
            throw ex;
        }
        System.out.println(amount + " is withdrawn");
        balAmount-= amount;
    }
}
public class InsufficientBalance{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.next();
        System.out.print("Enter the account number: ");
        String acNum = in.next();
        System.out.print("Enter the balance amount: ");
        double balAmount = in.nextDouble();
        Customer sid = new Customer(name, acNum, balAmount);
        sid.showDetails();
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = in.nextDouble();
        try{
            sid.withdraw(amount);
        }
        catch(InsufficientBalanceException ex){
            System.out.println(ex);
        }
    }
}