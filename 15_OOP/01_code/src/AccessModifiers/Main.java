package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        A obj = new A(5, "Abhi");

//        obj.num; // can't access because it is declared private
//        can be accessed using getter and setter method
        System.out.println(obj.getNum());
        obj.setNum(10); // setting num to 10
        int n = obj.getNum(); // getting the num;
        System.out.println(obj.getNum());
    }
}
