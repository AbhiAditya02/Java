import java.util.ArrayList;

public class Ques3 {
    // displaying the unique path available including diagonal paths
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println(pathReturn("", 2, 2));
    }

    static void path (String path, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }
        if (row > 1) path(path + "D ", row - 1, col);
        if (row > 1 && col > 1) path(path + "Dia ", row - 1, col - 1);
        if (col > 1) path(path + "R ", row, col - 1);
    }

    static ArrayList<String> pathReturn (String path, int row, int col){
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1)
            list.addAll(pathReturn(path + "D ", row - 1, col));
        if (row > 1 && col > 1)
            list.addAll(pathReturn(path + "Dia ", row - 1, col - 1));
        if (col > 1)
            list.addAll(pathReturn(path + "R ", row, col - 1));

        return list;
    }
}
