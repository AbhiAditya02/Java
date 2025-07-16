/*
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */

public class Pattern5 {
    public static void main(String[] args) {
        for (int row = 1; row < 2 * 5; row++) {
            int totalCol;
            if(row <= 5) totalCol = row;
            else totalCol = 5 - row % 5;
            for (int col = 1; col <= totalCol; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
