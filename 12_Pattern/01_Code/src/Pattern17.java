/*
17.      1
        212
       32123
      4321234
       32123
        212
         1
 */

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scan.nextInt();
        for (int row = 1; row < n * 2; row++) {
            int totalCol;
            if(row <= n) totalCol = row;
            else totalCol = n - row % n;
            int totalSpaces = n - totalCol;

            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print("  ");
            }

            for (int col = totalCol; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalCol; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
