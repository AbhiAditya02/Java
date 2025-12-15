package AccessModifiers.SamePkg;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(5, "Abhi");
        System.out.println(obj.num);
        System.out.println(obj.name);

        A obj1 = new A(5, "Abhi");
        System.out.println(obj1.num);

        // Both protected and default access modifier are accessible in subclass in same package

    }
}
