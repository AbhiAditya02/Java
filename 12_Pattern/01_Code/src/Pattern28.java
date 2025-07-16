import java.util.Scanner;

/*
28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */
public class Pattern28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scan.nextInt();
        for (int row = 1; row < 2 * n; row++) {
            int totalCol;
            if(row <= n) totalCol = row;
            else totalCol = n - row % n;
            int totalSpaces = n - totalCol;
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
