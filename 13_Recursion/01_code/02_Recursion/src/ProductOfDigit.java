public class ProductOfDigit {
    public static void main(String[] args) {
        int num = 50;
        System.out.println("Product of digit: " + ans(num));
    }
    static int ans(int num){
        if (num < 10) return num;
        return (num%10) * ans(num/10);
    }
}