package abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become a Engineer");
    }

    @Override
    void partner() {
        System.out.println("i Love someOne and she is " + Parent.age + "year Old");
    }

    @Override
    void normalMethod(){
        System.out.println("son has overridden parent's normal method");
    }
}
