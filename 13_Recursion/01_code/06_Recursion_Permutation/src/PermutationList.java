import java.util.ArrayList;

public class PermutationList {
    public static void main(String[] args) {
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            ans.addAll(permutationList((p.substring(0, i) + up.charAt(0) + p.substring(i)), up.substring(1)));
        }
        return ans;
    }
}

