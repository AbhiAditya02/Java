import java.util.Scanner;

// Multiple if-else statement
    /*
    syntax :
        if (condition 1){
             // code to be executed if condition 1 is true
             }
        else if (condition 2) {
            // code to be executed if condition 2 is true
            }
        else if (condition 3){
            // code to be executed if condition 3 is true
            }
        else {
            // code to be executed if all conditions are false
            }
     */
public class elseif {
    public static void main(String[] args) {
        System.out.print("Enter Your Salary : ");
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();
        if (salary<= 10000) {
            salary +=1000;
        }
        else if (salary <= 20000) {
            salary += 2000;
        }
        else {
            salary += 3000;
        }
        System.out.println(salary);
    }
}
