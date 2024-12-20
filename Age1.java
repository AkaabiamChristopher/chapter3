import java.util.Scanner;
public class Age1{
	public static void main(String [] args){
	
	Scanner userInput = new Scanner(System.in);

	System.out.println("enter age for party guest");
	int age = userInput.nextInt();
	System.out.print(age > 20 ? "u re invited" :"Go Home");
	
}
}