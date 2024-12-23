public class Secondlargest{
   public static void main(String[] args){
    int[] numbers = {63,21,7,0,83,49,74,3,68,43,92,38,92,3,78,20,2}; 

    int largest = 0;
    int secondLargest = 0;
    int smallest = 0;
    int secondSmallest = 0;

    for (int number : numbers) { if (number > largest) { secondLargest = largest;
     largest = number; 
   } else if (number > secondLargest && number != largest) {
     secondLargest = number;
     }
      if (number < smallest) { secondSmallest = smallest;
       smallest = number;
        } else if (number < secondSmallest && number != smallest){
          secondSmallest = number;
     }
 
}
 System.out.println("The second largest number is: " + secondLargest);
 System.out.println("The second smallest number is: " + secondSmallest);
   
    }


}
