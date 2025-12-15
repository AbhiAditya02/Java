package AccessModifiers.DifferentPkg;

import AccessModifiers.SamePkg.A;

public class B {
    public static void main(String[] args) {
        A obj = new A(5, "Abhi");
//        System.out.println(obj.num);
//        System.out.println(obj.name);
//        here we can not access both name and num because,
//        num is protected, i.e. can't be used in the other package without inheriting it.
//        name is default, i.e. it can't be used in other package
    }
}
