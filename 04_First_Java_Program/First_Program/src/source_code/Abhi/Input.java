package source_code.Abhi;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Roll Number : ");
        //Integer Input
        Scanner input = new Scanner(System.in);
        int roll_no = input.nextInt();
        System.out.println("Your roll no is "+roll_no);

        //Float Input
        float marks = input.nextFloat();
        System.out.println("float : " + marks);

        //String Input
        String s1 = input.next(); //input only one word from the line
        System.out.println("string " + s1);

        String s2 = input.nextLine(); //input full line
        System.out.println("string " + s2);

    }
}
