public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1=10, num2=20;
        swap(num1,num2);
    }

    static void swap(int a, int b ) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("num1 - "+a+ " num2 - "+b);
    }
}
