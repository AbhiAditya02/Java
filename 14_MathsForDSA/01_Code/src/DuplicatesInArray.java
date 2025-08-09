public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 2, 3, 1};
        System.out.println(isNotDuplicate(arr));

    }

    static int isNotDuplicate(int[] arr){
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
    }
}
