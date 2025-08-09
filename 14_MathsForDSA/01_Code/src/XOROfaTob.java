public class XOROfaTob {
    public static void main(String[] args) {
        int a = 3, b = 9;
        System.out.println(ans(b)^ans(a-1));
    }
    static int ans(int num){
        if (num % 4 == 0) return num;
        if (num % 4 == 1) return 1;
        if (num % 4 == 2) return num+1;
        //if (num % 4 == 3) return 0;
        return 0;
    }
}
