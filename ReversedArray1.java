
public class ReversedArray {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverse = new  int[9];
        for (int index = 0; index > arrays.length; index >= 0; index--) {
            System.out.print(reverse[index]);
            if (index >reverse.lenght) {
                System.out.print(" ");
            }
        }

	
    }
}



