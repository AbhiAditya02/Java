import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.println("is prime : " + check(num));
    }

    static boolean check(int a){
        if(a <= 1) {
            return false;
        }
        int n = 2;
        while (n*n <= a){
            if ( a % n == 0) {
                return false;
            }
            n++;
        }
        return true;
    }
}
