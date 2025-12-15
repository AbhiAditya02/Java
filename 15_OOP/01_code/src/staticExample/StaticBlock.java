package staticExample;

public class StaticBlock {
    static int a = 5;
    static int b;
    public static void main(String[] args) {
        System.out.println(b);
        //when ever the class is loaded then first all the static variables and block executed one and only ones
    }
    static {
        System.out.println("loaded static block");
        b = a*a;
    }
}
