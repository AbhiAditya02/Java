
//Take an input character from keyboard and check weather it is Upper case alphabet or lower case alphabet

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter an Alphabet : ");
        Scanner input = new Scanner(System.in);
        char Alphabet = input.next().trim().charAt(0);
        if (Alphabet >= 'a' && Alphabet <= 'z'){
            System.out.println("Lowercase");
        }
        else if (Alphabet >= 'A' && Alphabet <= 'Z') {
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Not an Alphabet");
        }
    }
}
