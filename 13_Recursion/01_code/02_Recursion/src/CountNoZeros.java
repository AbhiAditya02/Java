public class CountNoZeros {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println("No of zeros : " + ans(num));
    }

    private static int ans(int num) {
        if (num == 0) return 1;
        return counter(num, 0);
    }


    static int counter(int num, int count){
        if(num == 0) return count;
        if(num % 10 == 0) count++;
        return counter(num/10, count );
    }
}