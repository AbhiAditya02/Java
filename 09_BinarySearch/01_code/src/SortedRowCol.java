import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedRowCol {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7},
                {2, 5, 9},
                {3, 6, 10},
        };
        int target = 4;
        System.out.println(Arrays.toString(BS_in2D_Array(arr, target)));
    }
    static int[] BS_in2D_Array (int[][] arr, int target){
        int row = 0, column = arr[row].length-1;
        while(row < arr.length && column>=0){
            if(arr[row][column] == target){
                return new int[]{row,column};
            } else if (arr[row][column] < target){
                row++;
            }else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
