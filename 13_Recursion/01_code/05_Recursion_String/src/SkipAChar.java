public class SkipAChar {
    public static void main(String[] args) {
        String str = "abhi aditya";
        newString(str, ans);
        System.out.println(ans);
        System.out.println(newString(str));
    }

//    Method 1
    static StringBuilder ans = new StringBuilder();

    static void newString(String str, StringBuilder sb){
        if(str.isEmpty())  return ;

        if(str.charAt(0) != 'a') {
            sb.append(str.charAt(0));
            newString(str.substring(1), sb);
        }
        else
            newString(str.substring(1), sb);
    }



//    Method 2
    static String newString(String str){

        if(str.isEmpty())  return ""; // base case

        if(str.charAt(0) == 'a')
            return newString(str.substring(1)); // checking if char is a or not
        else
            return str.charAt(0) + newString(str.substring(1));
    }
}
