public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 6, 7, 0, 1, 2};
        int ans = binarySearch(num, 4, 0, findPivot(num));
        if (ans != -1){
            System.out.println(ans);
        } else {
            System.out.println(binarySearch(num, 4, findPivot(num)+1, num.length));
        }
    }
    //Finding pivot
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // right side is sorted, so pivot should be in left
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    //Applying Binary Search
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr[mid];
            if (value == target) {
                return mid;
            }else if (target < value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
