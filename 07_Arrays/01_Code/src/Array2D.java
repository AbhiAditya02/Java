import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
//        syntax:-
        int[][] arr = new int[3][2]; //declaration& initialisation of 2D Array.
        // Row size is important , column size may vary for every array
//        input :-
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < arr.length ; row++){
            for (int col = 0; col < arr[row].length ; col++){
                arr[row][col] = input.nextInt();
            }
        }

//        output:-
//        way 1 :
        for (int row = 0; row < arr.length ; row++){
            for (int col = 0; col < arr[row].length ; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
//        way 2 :
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

//        way 3 :
        for (int row = 0; row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

//        not fixed colum :
//        input -
        int[][] arr1 = {
                {1, 2, 3},
                {4,5},
                {6, 7, 8, 9}
        };
//        output -
        for (int row = 0; row < arr1.length ; row++){
            for (int col = 0; col < arr1[row].length ; col++){
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }
    }
}
