import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
//        INPUT
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = input.nextInt();
        }

//        OUTPUT
//        Way 1
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");;
        }

        System.out.println(" ");

//        Way 2
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println(" ");

//        Way 3
        System.out.println(Arrays.toString(arr));

    }
}
