import java.util.*;
class Second
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size= scanner.nextInt();
		try
		{
			int a[]= {1,2,3,4,5};
			System.out.println(a[size]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Program terminated");
	}
}
