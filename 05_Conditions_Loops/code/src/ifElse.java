
// If-else statement :

/*
       Syntax:
           if ( condition : boolean expression True or false){
               // code : if condition true do this
           }
           else{
               // code : if condition is false
           }
        */

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.print("Enter Your Salary : ");
        Scanner  input = new Scanner(System.in);
        float salary = input.nextFloat();
        if (salary > 10000) {
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}