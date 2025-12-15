package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(22);
        Parent.Hello();
        s.career();
        s.partner();

        Daughter d = new Daughter(24);
        Parent.Hello();
        d.career();
        d.partner();

        d.normalMethod();
        s.normalMethod();

        Parent.value;
    }
}
