import java.util.Scanner;
public class YearToMin{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

	System.out.print("Enter number of min: ");
double subtotal = scanner.nextDouble();
int min =0;
int day = 0;
int year = 0;

double day = min / 365 * 24;
double years = day / 365;
double days = day % 365;
System.out.println(min  + year  + day );

   }
}