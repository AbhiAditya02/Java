package Inheritance.Introduction;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight();
        System.out.println(box1.l + " " + box1.weight);

        BoxWeight box2 = new BoxWeight(2, 3, 5, 8);
//        System.out.println(box2.h); h is declared private so it can't be used anywhere.

        Box box3 = new Box();
//        System.out.println(box3.weight);
//        can't access the weight property as it the property of child class

//        parent reference and child object
        Box box4 = new BoxWeight(2, 3, 4, 5);
/*        System.out.println(box4.weight);
          Object type : decides which constructor runs
          Reference type : decides which variables & methods you are allowed to access.
          here box4 is parent class reference. so, we cant access child class variables.
*/

//        child reference and parent object
/*        BoxWeight box5 = new Box(2, 3, 4);

          Child reference : parent object is NOT allowed.
          because:-
                  A child contains everything the parent has + extra.
                  So a child reference requires those extra fields/methods to exist in the object.
                  But a Box object does not have so it's not logical to have this reference.
*/

        BoxPrice box6 = new BoxPrice();
    }

}
