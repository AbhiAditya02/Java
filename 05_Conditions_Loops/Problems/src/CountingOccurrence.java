
//Input two numbers, find that hoe many times second number digit is present in first number

import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Number : ");
        int firstNumber = in.nextInt();
        System.out.print("Second Number : ");
        int secondNumber = in.nextInt();
        int count = 0;

        while ( firstNumber != 0 ){
            if (firstNumber%10 == secondNumber){
                count++;
            }
            firstNumber = firstNumber/10;
        }

        System.out.println(secondNumber + "is present "+ count +" times in first number");

    }
}
