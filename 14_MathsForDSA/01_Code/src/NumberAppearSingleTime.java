public class NumberAppearSingleTime {
    public static void main(String[] args) {
        // enter max 8-bit number
        int[] arr = {2, 2, 2, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int result = 0;
        for (int i = 0; i < 8; i++) {
            int sum = 0;

            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
