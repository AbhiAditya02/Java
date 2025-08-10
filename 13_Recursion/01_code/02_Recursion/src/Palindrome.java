public class Palindrome {
    public static void main(String[] args) {
        int num = 515;
        System.out.println("Is Palindrome : " + ans(num));
    }

    private static boolean ans(int num) {
        return num == reverse(num, 0);
    }

    static int reverse(int num, int rev){
        if(num == 0) return rev;
        return reverse(num/10, rev*10 + num%10);
    }
}
