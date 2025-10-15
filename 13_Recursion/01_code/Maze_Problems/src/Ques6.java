import java.util.Arrays;

public class Ques6 {
    // Print Paths of all directions with their matrix
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] pathMatrix = new int[board.length][board[0].length];

        allPath("", board, 0, 0, pathMatrix, 1);
    }

    static void allPath(String path, boolean[][] maze, int row, int col, int[][] pathMatrix, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            pathMatrix[row][col] = step;
            for (int[] arr : pathMatrix) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }

        if(!maze[row][col]) return; // obstacle return

        // when visited make it false
        maze[row][col] = false;
        pathMatrix[row][col] = step;


        if (row < maze.length - 1) // Down
            allPath(path + "D ", maze, row + 1, col, pathMatrix, step + 1);

        if (row > 0) // Top
            allPath(path + "U ", maze, row - 1, col, pathMatrix, step + 1);

        if (col < maze[0].length - 1) // Right
            allPath(path + "R ", maze, row, col + 1, pathMatrix, step + 1);

        if (col > 0) // Left
            allPath(path + "L ", maze, row, col - 1, pathMatrix, step + 1);

        // when returning back to the previous call undo the changes
        maze[row][col] = true;
        pathMatrix[row][col] = 0;
    }
}
