import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 1)));
    }

    static int[] search(int[][] arr, int target){
        int start = 0;
        int end = arr.length * arr[0].length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int row = mid / arr[0].length;
            int column = mid / arr[0].length;
            if (arr[row][column] == target){
                return new int[]{row, column};
            } else if (arr[row][column] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
