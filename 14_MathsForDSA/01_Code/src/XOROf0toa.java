public class XOROf0toa {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(ans(num));
    }
    static int ans(int num){
        if (num % 4 == 0) return num;
        if (num % 4 == 1) return 1;
        if (num % 4 == 2) return num+1;
        //if (num % 4 == 3) return 0;
        return 0;
    }
}
