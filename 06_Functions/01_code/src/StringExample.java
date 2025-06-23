import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        System.out.print("Name : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(greeting(name));
    }

    static String greeting(String name){
        return "hello "+name+" !!";
    }
}
