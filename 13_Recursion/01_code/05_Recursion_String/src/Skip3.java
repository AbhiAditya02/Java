public class Skip3 {
    public static void main(String[] args) {
        String str = "ababhiaditya";
        System.out.println(newString(str));
    }

    static String newString(String str){
        if(str.isEmpty()) return "";

        if(str.startsWith("ab") && !str.startsWith("abhi"))
            return newString(str.substring(2));
        else
            return str.charAt(0) + newString(str.substring(1));
    }
}
