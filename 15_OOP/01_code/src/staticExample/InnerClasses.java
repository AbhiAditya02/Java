package staticExample;

public class InnerClasses {
    static class Test {
        static String name;
        Test(String name){
            Test.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("abhi");
        Test b = new Test("aditya");
        System.out.println(Test.name); // abhi
        System.out.println(Test.name); // aditya

        /*
         here both result is different as it's class
         Static class != static variables
         It behaves just like any normal top-level class
         It can be created directly without outer.new
        */

        /*
        if we don't create outer clas as static, we have to create the instance of the outer class.
        Then the instance of the inner class to use the inner class

        Syntax: to use without static Inner Class
            InnerClasses obj = new InnerClasses();
            InnerClasses.Test a = obj.new Test("abhi");
            System.out.println(a.name);
        */
    }
}

