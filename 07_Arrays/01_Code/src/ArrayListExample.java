import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){

        //Syntax:
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(12);
        list.add(34);
        list.add(122);
        list.add(412);
        list.add(674);
        list.add(912);
        list.add(1232);

        //output:-
        System.out.println(list);

        //Function:-
        //get element
        System.out.println(list.get(4));    //674

        //check element
        System.out.println(list.contains(34));  //true

        //remove element
        list.remove(2);
        System.out.println(list);

        //update or change
        list.set(2, 10);
        System.out.println(list);

        //list index
        System.out.println(list.get(1));


        //input :-
        ArrayList<Integer> list1 = new ArrayList<>(5);
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        // get items of any index
        for(int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));
        }
    }
}
