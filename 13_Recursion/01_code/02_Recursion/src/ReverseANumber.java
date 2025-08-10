public class ReverseANumber {
    public static void main(String[] args) {
        int num = 51;
        System.out.println("Reverse " + ans(num, 0));
    }
    static int ans(int num, int rev){
        if(num == 0) return rev;
        return ans(num/10, rev*10 + num%10);
    }
}
