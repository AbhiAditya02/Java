public class Print1toN {
    public static void main(String[] args) {
        ans(5);
    }
    static void ans(int num){
        if(num < 1){
            return;
        }
        ans(num-1);
        System.out.println(num);
    }
}