import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("","999");
        System.out.println(padCount("", "999"));
    }

    private static final String[] KEYS = {
            "",     //0
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqr",
            "stu",
            "vwx",
            "yz"    //9
    };

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        String letters = KEYS[digit];
        for (char ch : letters.toCharArray()) {
            pad(p + ch, up.substring(1));
        }

    }

    static ArrayList<String> padReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();
        String letters = KEYS[digit];
        for (char ch : letters.toCharArray()) {
            list.addAll(padReturn(p + ch, up.substring(1)));
        }
        return list;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        String letters = KEYS[digit];
        for (char ch : letters.toCharArray()) {
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}