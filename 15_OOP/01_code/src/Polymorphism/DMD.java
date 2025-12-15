package Polymorphism;

public class DMD {
//    Dynamic Method Dispatch
    int num;

    public DMD(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "num:" + num;
    }
    // here it override the toString method of object class

    public static void main(String[] args) {
        DMD obj = new DMD(5);
        System.out.println(obj);
    }
}
