import java.util.Scanner;

public class New_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit){
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruits");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruits");
            default -> System.out.println("fruit is out of list or it is not a fruit");
        }
    }
}
