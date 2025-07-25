public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,240};
        int target = 10;
        System.out.println("index: " + ans(arr, target));
    }

    static int ans (int[] arr, int target){
        int start = 0, end = 1;
        // starting with box of 2 then 4 then 8 ....
        while( target > arr[end]){
            int temp = end +1;
            // end = previous + size of box * 2
            end = end + (end -start +1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
