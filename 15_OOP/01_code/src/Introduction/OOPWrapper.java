package Introduction;

public class OOPWrapper {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b); // swap function don't work as Wrapper class are final
        System.out.println(a + " " + b);

        final Stu_dent s1 = new Stu_dent("Abhi");
        s1.name = "Abhi Aditya";
        // when a non primitive is final, you cannot reassign it.
        // s1 = new A("new object");
        Stu_dent s2 = new Stu_dent("kunal");

        System.out.println(s2);

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}