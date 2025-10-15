public class ASCII {
    public static void main(String[] args) {
//        Method 1
        subsets("","ab");
    }
//    Method 1
    static void subsets(String a, String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch = b.charAt(0);
        subsets(a+ch, b.substring(1));
        subsets(a+(ch+0), b.substring(1));
        subsets(a, b.substring(1));
    }
}
