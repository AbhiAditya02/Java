public class NoOfDigitInBase {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(ans(num));
    }
    static int ans(int num){
        return (int) (Math.log(num)/Math.log(2)) + 1;
    }
}
