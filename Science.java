import java.util.Scanner;
public class Science{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

System.out.print("Enter amount of water in kilogram: ");
double kilogram = scanner.nextDouble();

System.out.print("Enter initial initialtemperature: ");
double initialtemperature = scanner.nextDouble();

System.out.print("Enter final: ");
double finaltemperature = scanner.nextDouble();

kilogram = kilogram * finaltemperature - initialtemperature * 4184;


System.out.print("The temperature is " + initialtemperature);




    }

}