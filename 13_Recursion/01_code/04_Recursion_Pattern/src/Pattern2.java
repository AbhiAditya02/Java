import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        pattern2(i, 0);
    }
    static void pattern2(int row, int column){
        if(row == 0) return;
        if (row > column){
            pattern2(row, ++column);
            System.out.print('*');
        }else {
            pattern2(--row, 0);
            System.out.println();
        }
    }
}
