public class NoOfPermutaion {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permutationCount("", str));
    }

    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            count = count + permutationCount((p.substring(0, i) + up.charAt(0) + p.substring(i)), up.substring(1));
        }
        return count;
    }
}
