import java.util.Scanner;
public class FeetMeter{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number in feet: ");
	  double feet = scanner.nextDouble();
		
		feet = feet * 0.305;
	System.out.print(feet);


	}

} 