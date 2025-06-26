public class EvenDigit {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] number = {12,345,21,6,7896};
        System.out.println(findNumbers(number));
    }

    //count the no of numbers having even digit
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //find number have even digit or not
    static boolean even(int num) {
        return digit(num) % 2 == 0;
    }

    //find no of digit a number having
    static int digit(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    //find no of digit a number having way 2
    static int digitWay2(int num) {
        return (int)(Math.log10(num)+1);
    }
}
