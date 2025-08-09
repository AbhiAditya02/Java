public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(ans(num));
    }
    static int ans(int num){
        int result = num & (~num + 1);
        return (int) (Math.log(result)/Math.log(2)) + 1;
    }
}
