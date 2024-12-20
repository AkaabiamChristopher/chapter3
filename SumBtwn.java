import java.util.Scanner;
public class SumBtwn{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

System.out.print("Enter number between 0 to 1000: ");
int number = scanner.nextInt();

int sum = 0;

number = number % 10;
sum = number / 10;
 System.out.print(sum); 



   }

}
