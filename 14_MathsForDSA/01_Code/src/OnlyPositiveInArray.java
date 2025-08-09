public class OnlyPositiveInArray {
    public static void main(String[] args) {
        int[] arr = {-2, 3, 2, 4, -5, 5,-4};
        int add = 0;
        for ( int num : arr ) {
            add += num;
        }
        System.out.println(add);
    }
}
