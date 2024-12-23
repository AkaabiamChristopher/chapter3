public class SumArrayLargest{
   public static void main(String[] args){

	int[] num = {22,32,3,5,67,89,9,6,7,6,6};
	int largest = num[0];
	int smallest = num[0];

for(int count = 1; count < num.length; count++){
   if(num[count] > largest){
 		largest = num[count]; 
	}
}

for(int count = 1; count < num.length; count++){
   if(num[count] < smallest){
 		smallest = num[count]; 
	}
}

System.out.println("The largest number is : " + largest);
System.out.println("The smallest number is : " + smallest);


     }

}