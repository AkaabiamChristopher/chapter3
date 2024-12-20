import java.util.Scanner;
public class Acceration{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

System.out.print("Enter  first velocity,velocity0: ");
double velocity0 = scanner.nextDouble();

System.out.print("Enter  first velocity,velocity2: ");
double velocity1 = scanner.nextDouble();

System.out.print("Enter time: ");
double time = scanner.nextDouble();

time = velocity0 + velocity1 / time;

System.out.print("The average accelrration is" + time);

    }
}