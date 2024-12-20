import java.util.Scanner;
public class Fahrenheiht{
	public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number to convert to Fahrenheit: ");
double number = scanner.nextDouble();

number = 9.0 / 5 * number + 32; 

System.out.println( number); 


	}


}