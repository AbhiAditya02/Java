public class SkipAWord {
    public static void main(String[] args) {
        String str = "abhi aditya";
        System.out.println(newString(str));
        newString(str, ans);
        System.out.println(ans);
    }

//    Method1
    static String newString(String str){
        if(str.isEmpty()) return "";

        if(str.startsWith("abhi"))
            return newString(str.substring(4));
        else
            return str.charAt(0) + newString(str.substring(1));
    }

//    Method2
    static StringBuilder ans = new StringBuilder();
    static void newString(String str, StringBuilder sb){
        if(str.isEmpty()) return;

        if(str.startsWith("abhi"))
            newString(str.substring(4), sb);
        else{
            sb.append(str.charAt(0));
            newString(str.substring(1), sb);
        }
    }

}
