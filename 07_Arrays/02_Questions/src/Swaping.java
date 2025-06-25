import java.util.Arrays;
import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5 ; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("First Index :");
        int index1 = input.nextInt();

        System.out.print("Second Index : ");
        int index2 = input.nextInt();

        swap(arr, index1, index2);
    }
    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
