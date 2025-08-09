public class NumberIsPowerOf2 {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(ans(num));
    }
    static boolean ans(int num){
        if ((num & num-1) == 0) return true;
        return false;
    }
}
