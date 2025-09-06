import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        pattern1(i, 0);
    }
    static void pattern1(int row, int column){
        if(row == 0) return;
        if (row > column){
            System.out.print('*');
            pattern1(row, ++column);
        }else {
            System.out.println();
            pattern1(--row, 0);
        }
    }
}
