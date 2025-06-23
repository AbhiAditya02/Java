public class FunctionOverloading {
    public static void main(String[] args) {
        demo("Abhi");
        demo(123);
    }

    static void demo(String a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void demo(int z){
        System.out.println("second one");
        System.out.println(z);
    }
}
