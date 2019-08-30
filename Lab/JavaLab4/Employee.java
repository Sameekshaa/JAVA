package p1;
public class Employee{
	String name;
	String address;
	double salary;

public Employee(String n,String a,double s)
{
	name=n;
	address=a;
	salary=s;
}
public void showEmployeeInfo(){
	System.out.println(" Name: " + name);
	System.out.println(" Address: " + address);
	System.out.println(" Salary: " + salary);
	}
}
