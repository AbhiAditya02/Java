public class CeilingOfNumber {
    //Smallest number greater/equal to the target element is called Ceiling of the number.
    public static void main(String[] args) {
        int[] num = {2, 4, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println("Index: "+ceiling(num, target));
        System.out.println("Element: "+num[ceiling(num, target)]);
    }
    static int ceiling(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
