import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Is Armstrong : " + isArmstrong(num,power(num
        )));;
    }

    static int power(int a) {
        int count = 0;
        while (a != 0){
            a = a/10;
            count++;
        }
        return count;
    }

    static boolean isArmstrong(int number, int power) {
        int original = number;
        int sum = 0;
        while (number != 0){
            int rem = number % 10;
            number = number / 10;
            sum = (int) (sum + Math.pow(rem, power));
        }
        return sum == original;
    }
}
