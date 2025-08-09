public class NoOfSetBit {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(ans(num));
    }
    static int ans(int num){
        int count = 0;
        while(num > 0){
            num &= (num-1);
            count++;
        }
        return count;
    }
}
