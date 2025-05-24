import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if(number <=1){
            System.out.println("Neither Prime Nor Composite");
        }
        else{
            for(int i = 2 ; i*i <= number ; i++){
                if (number % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
        input.close();
    }
}