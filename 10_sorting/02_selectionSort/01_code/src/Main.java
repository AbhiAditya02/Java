import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 0, 1, 2, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //find max element in the array
            int end = arr.length - i - 1;
            swap(arr, getMax(arr, 0, end), end);
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
