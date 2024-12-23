public class SumArrayOfInteger{
    public static void main(String[] args){

	int[] numbers = {3,4,4,55,6,7,68,8,76,5};
	int sum = 0;

for(int num : numbers){
	sum += num;
}

System.out.print("The sum of numbers is: " + sum);

	}

}