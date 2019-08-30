import java.util.Scanner;
public class EnterName{
	public static void main(String[] args){
		//Obj of scanner to get data from keyboard
		Scanner in = new Scanner(System.in);       	//System.in is passed to get data from keyboard
		System.out.print("Enter name ");
		String str = in.nextLine();					//nextLine() is non-static method to get string input
		System.out.println("Hello " + str);	
	}
}
