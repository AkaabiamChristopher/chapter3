import java.util.Scanner;
public class Financial{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
System.out.print("Enter subtotal rate");
double subtotal = scanner.nextDouble();
System.out.print("Enter gratuity rate");
double gratuity = scanner.nextDouble();
	
subtotal = subtotal * gratuity / 100;
gratuity = gratuity * gratuity;

System.out.print(subtotal);
System.out.print(gratuity);

    }

}