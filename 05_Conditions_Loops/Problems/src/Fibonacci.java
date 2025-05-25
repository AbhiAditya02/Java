
// Find the nth Fibonacci number.
//Given three input a, b, n
// Where 'a' is the starting number of Fibonacci series, 'b' is the next number after 'a' and 'n' is nth Fibonacci number.


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number of Fibonacci series : ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number of Fibonacci series : ");
        int b = input.nextInt();
        System.out.print("enter nth position : ");
        int n = input.nextInt();
        int count = 2;

        while (count != n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }

        System.out.println(n+"th Fibonacci number is : " + b);

    }
}
