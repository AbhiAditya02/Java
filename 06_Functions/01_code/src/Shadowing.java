public class Shadowing {
    static int x=10; // this will be hidden/shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //10
        int x;
//        System.out.println(x); // scope will began when value is initialised
        x = 20;
        System.out.println(x); //20
        example(); //10
    }
    static void example() {
        System.out.println(x);
    }
}
