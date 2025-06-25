import java.util.ArrayList;
import java.util.Scanner;

public class Multi_D_AL {
    public static void main(String[] args) {
        //Declaration
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

        //Initialisation
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        //Add element
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                list.get(i).add(input.nextInt());
            }
        }

        //Output
        System.out.println(list);
    }
}
