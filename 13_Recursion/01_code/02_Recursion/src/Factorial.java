public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("factorial : " + ans(num));
    }
    static int ans(int num){
        if(num <= 1) return 1;
        return num * ans(num-1);
    }
}
