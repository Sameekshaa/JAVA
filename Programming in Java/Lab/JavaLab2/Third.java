import java.util.*;
class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		super(message);
	}
}
class Customer
{
	String name;
	int acNum;
	double balAmount;
	Customer(String n, int a, double b)
	{
		name=n;
		acNum=a;
		balAmount=b;
	}
	void withdraw(double amount) throws InsufficientBalanceException 
	{
		
			if(balAmount<amount)
			{
				InsufficientBalanceException obj= new InsufficientBalanceException("There is not sufficient balance in your account.");
				throw obj;
			}
			else
			{
				System.out.println("The available balance is: Rs. "+balAmount);
				balAmount-=amount;
				System.out.println("The withdrawn amount is:"+amount);
				System.out.println("The remaining balance is:"+balAmount);
			}
	}

}
class Third
{
	public static void main(String []args)
	{
		Customer customer = new Customer("Sooraj",1234,15432.56);
		System.out.println("Enter the amount to be withdrawn in Rs.");
		Scanner scanner= new Scanner(System.in);
		double a= scanner.nextDouble();
		try
		{
			customer.withdraw(a);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex);
		}
	}
}

		
