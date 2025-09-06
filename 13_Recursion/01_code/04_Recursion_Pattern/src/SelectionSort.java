import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        sorting(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr, int row, int column, int max) {
        if (row == 0) return;

        if (column < row) {
            if (arr[column] > arr[max]) max = column;
            sorting(arr, row, column + 1, max);
        } else {
            swap(arr, max, row - 1);
            sorting(arr, row - 1, 0, 0);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
