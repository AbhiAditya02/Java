import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        example(1, -2, 3, -4, 5, -6);
        example(); // it also executes without parameter.
        multipleArguments(1, 2, 1, -2, 3, -4);
    }
    static void example(int ...z) {
        System.out.println(Arrays.toString(z));
    }
    static void multipleArguments(int a, int b, int ...z){
        System.out.printf("a: %d, b: %d, z: %s\n", a, b, Arrays.toString(z));
    }
}
