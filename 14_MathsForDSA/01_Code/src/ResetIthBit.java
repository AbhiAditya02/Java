public class ResetIthBit {
    public static void main(String[] args) {
        int num = 14, pos = 3;
        System.out.println(ans(num, pos));
    }
    static int ans(int num, int pos){
        return num & ~(1<<(pos-1));
    }
}
