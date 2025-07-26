public class Palindrome {
    public static void main(String[] args) {
        String a = "Abac";
        System.out.println(isPalindrome(a));;
    }

    static boolean isPalindrome(String s){
        String b = s.toLowerCase();
        StringBuilder ans = new StringBuilder(b).reverse(); // .reverse() it reverse the string
        return b.equals(ans.toString());// convert string builder to string for comparison
    }
}
