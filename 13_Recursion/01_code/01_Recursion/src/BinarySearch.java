public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }

    static int search (int[] arr, int target, int s, int e){
        //base condition
        if (s > e) return -1;

        // body
        int m = s + (e - s) / 2;
        // checking condition
        if (arr[m] == target) return m;

        if (arr[m] < target) {
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);
    }
}
