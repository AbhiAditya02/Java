public class FindIthBit {
    public static void main(String[] args) {
        int num = 10, pos = 4;
        System.out.println(ans(num, pos));
    }
    static int ans(int num, int pos){
        int result = num & (1<<(pos-1));
        if (result != 0) return 1;
        return 0;
    }
}
