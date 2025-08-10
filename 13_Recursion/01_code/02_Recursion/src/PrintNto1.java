public class PrintNto1 {
    public static void main(String[] args) {
        ans(5);
    }
    static void ans(int num){
        if(num < 1){
            return;
        }
        System.out.println(num);
        ans(num-1);
    }
}
