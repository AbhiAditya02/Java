package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human("kunal", 26, 100000, false);
        Human abhi = new Human("kunal", 20, 0, false);
        System.out.println(Human.population);

//        fun() // a non-static method can not be called directly without the instance of the class
//        we have to create an instance of the class to call fun method
        Main obj = new Main();
        obj.fun();

//        we can call static method without creating the object
        Human.greeting();
    }

    static void staticMethod(){
//        fun(); // we can use a non-static variable/method inside the static method
        Main obj = new Main();
        obj.fun();
    }

    void fun2(){
        fun(); // we can use a non-static method inside the non-static method
    }
    void fun(){
        System.out.println("I am fun method");
    }
}
