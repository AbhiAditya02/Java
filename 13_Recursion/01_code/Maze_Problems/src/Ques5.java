public class Ques5 {
    // Paths of all directions
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
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

        // when visited make it false
        maze[row][col] = false;

        if (row < maze.length - 1) // Down
            path(path + "D ", maze, row + 1, col);

        if (row > 0) // Top
            path(path + "U ", maze, row - 1, col);

        if (col < maze[0].length - 1) // Right
            path(path + "R ", maze, row, col + 1);

        if (col > 0) // Left
            path(path + "L ", maze, row, col - 1);

        // when returning back to the previous call undo the changes
        maze[row][col] = true;
    }
}
