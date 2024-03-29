public class DFS {
    // this is a dfs algorithm template for leetcode type question
    // input is int x , y and matrix, visited
    // x and y could be the starting node so it could be (0,0) in this case
    // depending on your question, you can modify the input value.
    public void DFS(int x, int y, int[][] matrix, boolean[][] visited){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

        if (visited[x][y]){return;}
        else visited[x][y] = true;

        // visit it's neighbir
        for (int[] dir : dirs){
            int next_x = x + dir[0];
            int next_y = y + dir[1];
            if (next_x > 0 && next_x < row && next_y > 0 && next_y <  col){
                DFS(next_x,next_y, matrix, visited);
            }
        }
    }
}
