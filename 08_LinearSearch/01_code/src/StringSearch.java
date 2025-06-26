import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Abhi Aditya";
        char target = 'y';
        System.out.println("IsCharacter: " + search(name, target));

        //print string like an array of char.
        System.out.println("string to array: " + Arrays.toString(name.toCharArray()));
        // .to charArray(0) :- method converts a String into a character array (char[]).
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
