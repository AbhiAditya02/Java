import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        sorting(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr, int row, int column){
        if(row == 0) return;
        if (row > column){
            if(arr[column] > arr[column+1]) swap(arr, column);
            sorting(arr, row, ++column);
        }else {
            sorting(arr, --row, 0);
        }
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
