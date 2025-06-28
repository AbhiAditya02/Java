public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println("Index: " + binarySearch(arr, target));
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            // find the middle element
//            int mid = (s + e) / 2; // might be possible that (s + e) exceeds the range of int in java
            int mid = s + (e - s) / 2;

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
