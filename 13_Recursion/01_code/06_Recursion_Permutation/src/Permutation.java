public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            permutation((p.substring(0, i) + up.charAt(0) + p.substring(i)), up.substring(1));
        }
    }
}
