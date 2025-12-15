package Polymorphism;

public class CTP {
    //compile time polymorphism
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        CTP obj = new CTP();
        System.out.println(obj.sum(1,3));
        System.out.println(obj.sum(1, 3, 5));
    }
}
