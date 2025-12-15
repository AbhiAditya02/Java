package abstractDemo;

public abstract class Parent {

    static int age;
//    final int value = Integer.MAX_VALUE;

    public Parent(int age){
        this.age = age;
    }

    static void Hello(){
        System.out.println("Hey !!");
    }

    void normalMethod(){
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
