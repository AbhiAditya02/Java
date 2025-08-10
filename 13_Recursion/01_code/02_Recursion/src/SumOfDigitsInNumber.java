public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int num = 51;
        System.out.println("Sum of digit: " + ans(num));
    }
    static int ans(int num){
        if (num < 10) return num;
        return (num%10) + ans(num/10);
    }
}
