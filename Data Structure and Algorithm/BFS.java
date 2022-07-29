import java.util.Queue;

public class BFS {
    // this is normal bfs algorithm template for leetcode type question
    // the input of this function is a matrix from question itself, a queue to add the same level node
    // and a matrix called visited to store poped node from the queue which is the same size as matrix
    public void bfs(char[][] matrix, Queue<int[]> queue, boolean[][] visited){
        int row = matrix.length;
        int col = matrix[0].length;
        // the next move can be these four directions
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

        while (!queue.isEmpty()){
            int[] curr = queue.remove();
            int x = curr[0];
            int y = curr[1];
            if (!visited[x][y]){
                visited[x][y] = true;
            }
            for (int[] dir : dirs){
                int next_x = curr[0] + dir[0];
                int next_y = curr[1] + dir[1];

                if ( next_x > 0 && next_x < row && next_y > 0 && next_y <  col){
                    queue.add(new int[]{next_x, next_y});
                }
            }
        }
    }
}
