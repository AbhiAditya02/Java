package source_code.Abhi;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Roll Number : ");
        Scanner input = new Scanner(System.in);
        int roll_no = input.nextInt();
        System.out.println("Your roll no is "+roll_no);
    }
}
