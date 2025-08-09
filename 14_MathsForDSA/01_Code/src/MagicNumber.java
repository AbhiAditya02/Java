public class MagicNumber {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(ans(num));
    }
    static int ans(int num){
        int base = 5, result = 0;
        while(num != 0){
            if((num & 1) == 1) {
              result += base;
            }
            num >>= 1;
            base *= 5;
        }
        return result;
    }
}
