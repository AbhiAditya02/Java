// Take 3 integer input from keyboard, Find the largest numbers among them

// Approach 1 :
/*
    import java.util.Scanner;

    public class LargestOfThree {
        public static void main(String[] args) {
            System.out.print("Enter three numbers");
            Scanner input = new Scanner(System.in);
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int number3 = input.nextInt();

            int max = number1;

            if (max < number2){
                max = number2;
            }
            if (max < number3){
                max = number3;
            }

            System.out.println("Maximum : " + max);
        }
    }
*/

// Approach 2 :

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers : ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int max = Math.max( number3, Math.max( number1, number2) );
        System.out.println("Maximum : " + max);
    }
}

// Math is the class present in Java.lang package.
// max is function present in it which takes two number as an argument and returns maximum out of them.