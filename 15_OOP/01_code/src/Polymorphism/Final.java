package Polymorphism;

public class Final {

    final int side = 10; // we cant not change this

    final void area(){



    }

    //Polymorphism do not apply to the instance variables

    // final keyword can be used to prevent overriding and inheritance
    /*
        final means cannot be changed.
        Java allows final with:
            Variables
            Methods
            Classes
    */

/*
    1) Early Binding (Static Binding):
        Early binding means the method call is resolved at compile time.
        we can not override the static method as it depend on reference type.
        Static method can be inherited but not overridden

    2) Late Binding (Dynamic Binding):
        Late binding means the method call is resolved at runtime
        It is based on the object type.
        This is what enables runtime polymorphism.
 */
}
