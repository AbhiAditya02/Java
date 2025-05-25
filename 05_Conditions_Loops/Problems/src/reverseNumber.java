import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number : ");
        int firstNumber = in.nextInt();
        int reverseNumber = 0;

        while ( firstNumber != 0 ){
            int remainder = firstNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            firstNumber = firstNumber/10;
        }

        System.out.println("Reversed Number = " + reverseNumber );
    }
}
