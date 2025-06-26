public class Main {
    public static void main(String[] args) {
        int[] numbers = {23, 44, 59, 78, 1, 8, 852};
        int target = 7;
        System.out.println("index: " + linearSearch(numbers, target));
        System.out.println("isPresent: " + check(numbers, target));
        System.out.println("IsElement: "+ ifElement(numbers,target));
    }
    //search in the array. // return index -1 if item found.
    static int linearSearch(int[] arr, int target){
        // run a for loop
        for (int index = 0; index < arr.length; index++){
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
    //searching just for checking
    static boolean check(int[] arr, int target){
        // run a for loop
        for (int index = 0; index < arr.length; index++){
            if(arr[index]== target){
                return true;
            }
        }
        return false;
    }

    //returning the element if exist
    static int ifElement(int[] arr, int target){
        // run a for loop
        for (int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

}
