import java.util.Scanner;
public class Age{
	public static void main(String [] args){
	
	Scanner userInput = new Scanner(System.in);

	System.out.println("enter age for party guest");
	int age = userInput.nextInt();
	
	if (age > 20){

		System.out.println("u are invited");
	}else
 	 	System.out.print("Go Home");






	}


}