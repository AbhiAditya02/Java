package AccessModifiers.DifferentPkg;

import AccessModifiers.SamePkg.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(5, "Abhi");
        System.out.println(obj.num);

//        here we can access num because,
//        num is protected, i.e. can use in the other package by creating the subclass.
        A obj1 = new A(5, "Abhi");
//        System.out.println(obj1.num);
//        but reference type should be of the child class type not parent class type.

//        System.out.println(obj.name);
//        here we can not access both name because,
//        name is default, i.e. it can't be used in other package by any means
    }


}
