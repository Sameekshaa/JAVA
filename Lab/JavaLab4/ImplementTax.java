/*
-->Create a class Vechile with name,color,price.
-->Initialize them using parameterized constructor.
-->Create a interface Tax with two methods: double getTax(), double priceIncludingTax()
-->Create a class Car which is a subclass of Vechile & implement Tax. Calcuate tax as 25% of price.
-->Create a class Bike which is a subclass of Vechile & implement Tax. Calcuate tax as 15% of price.
-->Provide a test class.
*/
class Vechile{
	String name;
	String color;
	double price;
	Vechile (String n, String c, double p){
		name =n;
		color = c;
		price = p;
	}
	void showDetails(){
		System.out.println("Name : " + name);
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	
	}
}
interface Tax{
	double getTax();
	double priceIncludingTax();
}
class Car extends Vechile implements Tax{
	Car (String n, String c, double p)
	{
		super (n,c,p);
	}
	public double getTax(){
		double tax = 0.25 * price;
		return tax;
	}
	public double priceIncludingTax(){
		double tax= 0.25 * price + price;
		return tax;
	}
}
class Bike extends Vechile implements Tax{
	Bike (String n, String c, double p)
	{
		super (n,c,p);
	}
	public double getTax(){
		double tax1 = 0.15 * price;
		return tax1;
	}
	public double priceIncludingTax(){
		double tax1 = 0.15 * price + price;
		return tax1;
	}
}
public class ImplementTax{
	public static void main (String[]args){
		Car C=new Car("Toyota","Brown",1000000);
		C.showDetails();
		System.out.println("The tax is : " + C.getTax());
		System.out.println("The tax is : " + C.priceIncludingTax());
		System.out.println("----------------------------------------------------------");
		Bike B=new Bike("Honda","Black",500000);
		B.showDetails();
		
		System.out.println("The tax is : " + C.getTax());
		System.out.println("The tax is : " + C.priceIncludingTax());
		}
}
