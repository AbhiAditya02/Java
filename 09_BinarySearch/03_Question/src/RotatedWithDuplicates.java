public class RotatedWithDuplicates {
    public static void main(String[] args) {
        int[] num = {2, 2, 2, 3, 4, 2};
        int ans = binarySearch(num, 4, 0, findPivotWithDuplicates(num));
        if (ans != -1){
            System.out.println(ans);
        } else {
            System.out.println(binarySearch(num, 4, findPivotWithDuplicates(num)+1, num.length));
        }
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //check whether mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal
            // check start and end is pivot or not
            // then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) return end - 1;
                end--;
            }

            // left side element are equals, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // right side element are equals, so pivot should be in left
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
