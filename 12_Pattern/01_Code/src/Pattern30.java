/*
30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */

import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scan.nextInt();
        for (int row = 1; row <= n; row++) {
            int totalSpaces = n - row;
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
