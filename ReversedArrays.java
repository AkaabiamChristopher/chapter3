public class ReversedArrays {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int index = arrays.length - 1; index >= 0; index--) {
            System.out.print(arrays[index] + " ");
        }
    }
}
