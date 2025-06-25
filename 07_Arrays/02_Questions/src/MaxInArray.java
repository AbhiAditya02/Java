import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5 ; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Maximum = " + Max(arr));

    }
    static int Max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num >= max) {
                max = num;
            }
        }
        return max;
    }
}
