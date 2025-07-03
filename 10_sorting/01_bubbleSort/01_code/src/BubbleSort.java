import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // run the steps no of element -1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false; // first swap is false as there is no swap occur for that value of i
            // now from here comparison starts j = 1
            for (int j = 1; j < arr.length - i; j++) {
                // swap if j-1 is smaller than j
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;//As happens then swap changes to true
                }
            }
            // if any swap does not occur than it means array is sorted
            // so no need to check for higher value of i
            if (!swapped) { //swapped == false //if swap does not occur then it remains false and !swapped = true.
                break;
            }
        }
    }
}
