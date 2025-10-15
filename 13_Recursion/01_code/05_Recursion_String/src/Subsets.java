import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
//        Method 1
        subsets("","abc");
//        Method 2
        System.out.println(subset("","abc"));
    }

//    Method 1
    static void subsets(String a, String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        String x = a + b.charAt(0);
        subsets(x, b.substring(1));
        subsets(a, b.substring(1));
        return;
    }

//    Method 2
    static ArrayList<String> subset(String a, String b) {
        if (b.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        String x = a + b.charAt(0);
        ArrayList<String> left = subset(x, b.substring(1));
        ArrayList<String> right = subset(a, b.substring(1));
        left.addAll(right);
        return left;
    }
}
