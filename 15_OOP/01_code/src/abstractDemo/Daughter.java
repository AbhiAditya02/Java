package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become a Doctor");
    }

    @Override
    void partner() {
        System.out.println("i Love someOne and he is " + Parent.age + "year Old");
    }
}
