import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //create an array
        int[] array = {1,2,3,4};
        change(array);
        System.out.println(Arrays.toString(array));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}