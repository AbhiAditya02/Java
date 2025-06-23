import java.util.Scanner;

public class Sum {
    public static void main(StringExample[] args) {
//        for nonstatic we have to create an object.
        Sum obj = new Sum();
        obj.sum();
    }

    /*
        return_type function_name (arguments / parameters) {
            //code
            return statement;
        }
     */

    void sum(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter 1st number ");
        num1 = input.nextInt();
        System.out.print("Enter 1st number ");
        num2 = input.nextInt();
        System.out.println("Sum = " + (num1+num2) );
    }

}
