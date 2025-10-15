import java.util.ArrayList;

public class Ques2 {
    // displaying the unique path available
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        path(ans, 3, 2);
        System.out.println(pathReturn("", 3, 2));
    }

    static void path (StringBuilder path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path.toString());
            return;
        }
        if (row > 1) path(new StringBuilder(path).append('D'),row-1, col);
        if (col > 1) path(new StringBuilder(path).append('R'), row, col-1);
//        new StringBuilder(path) creates a copy,
//        so each recursive branch has its own independent path.


//        use String instead of String builder
//        if (row > 1) path(path + "D", row - 1, col);
//        if (col > 1) path(path + "R", row, col - 1);
    }

    static ArrayList<String> pathReturn (String path, int row, int col){
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1)
            list.addAll(pathReturn(path + "D", row - 1, col));
        if (col > 1)
            list.addAll(pathReturn(path + "R", row, col - 1));

        return list;
    }
}
