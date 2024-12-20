import java.util.Scanner; 
 public class CompoundValue{
     public static void main(String[] args){
   
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the monthly saving amount: ");
double  month = scanner.nextDouble();
 
month = (100 + 302.507) * (1 + 0.00417);

System.out.print("The account value is: " + month);
    }
}