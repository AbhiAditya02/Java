import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Number : ");
        int firstNumber = in.nextInt();
        System.out.print("Enter the operator : ");
        char operator = in.next().trim().charAt(0);
        System.out.print("Second Number : ");
        int secondNumber = in.nextInt();

        if (operator == '+'){
            System.out.println("Ans : " + (firstNumber + secondNumber));
        } else if (operator == '-') {
            System.out.println("Ans : " + (firstNumber - secondNumber));
        } else if (operator == '*' || operator == 'X') {
            System.out.println("Ans : " + (firstNumber * secondNumber));
        } else if (operator == '/') {
            System.out.println("Ans : " + ( (float)firstNumber / (float) secondNumber));
        } else if (operator == '%') {
            System.out.println("Ans : " + (firstNumber % secondNumber));
        } else {
            System.out.println("Invalid Operator");
        }
    }
}
