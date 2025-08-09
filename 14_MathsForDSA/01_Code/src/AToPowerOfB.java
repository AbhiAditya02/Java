public class AToPowerOfB {
    public static void main(String[] args) {
        int base = 3;
        int exp = 6;
        System.out.println(ans(base, exp));
    }
    static int ans(int base, int exp){
        int result = 1;
        while (exp > 0){
            if ((exp & 1) == 1){
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return result;
    }
}
