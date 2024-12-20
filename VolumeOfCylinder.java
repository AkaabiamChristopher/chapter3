import java.util.Scanner;
public class VolumeOfCylinder{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

System.out.print("Enter the radius and length of a cylinder:");
double area = scanner.nextDouble();

area = area * area * 22/7;

System.out.print("Enter the volume  of the cylinder:");
double volume = scanner.nextDouble();

 volume = volume * area;

 System.out.println( area); 
 System.out.println( volume); 

	}

}