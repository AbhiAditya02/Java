import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5 ; i++){
            arr[i] = input.nextInt();
        }
        Reverse(arr);
    }

    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[start+i];
            arr[start+i] = arr[end-i];
            arr[end-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
