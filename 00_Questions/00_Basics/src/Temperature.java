import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Fahrenheit : ");
        Scanner input = new Scanner(System.in);
        float fahrenheit = input.nextFloat();
        float celsius = ( fahrenheit - 32 ) * 5 / 9;
        System.out.println("Temperature in celsius : " + celsius );
        input.close();
    }
}
