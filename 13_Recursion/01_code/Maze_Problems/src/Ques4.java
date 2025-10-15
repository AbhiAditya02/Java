public class Ques4 {
    // Maze with obstacle
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        path("", board, 0, 0);
    }

    static void path (String path, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if(!maze[row][col]) return; // obstacle return

        if (row < maze.length - 1)
            path(path + "D ", maze, row + 1, col);
        if (row < maze.length - 1 && col < maze[0].length - 1)
            path(path + "Dia ", maze, row + 1, col + 1);
        if (col < maze[0].length - 1)
            path(path + "R ", maze, row, col + 1);
    }
}
