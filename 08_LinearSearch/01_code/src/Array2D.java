import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 56}, {18, 12}};
        int target = 56;
        int[] ans = search(arr,target);
        System.out.println("Element Index: " + Arrays.toString(ans));
        System.out.println("maximum: " + maximum(arr));
    }
    //Searching in the 2DArray
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // here array is not initialised. So, we have to initialise it.
                }
            }
        }
        return new int[]{-1, -1};
    }
    //maximum in 2DArray
    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
