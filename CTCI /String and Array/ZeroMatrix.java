public class ZeroMatrix {

    public void setZero(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        // tranvser through the matrix array and store the row and column with value 0
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j <matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }


        // nullify row
        for (int i = 0; i < matrix.length; i++){
            if(row[i]){
                nullifyRow(matrix,i);
            }
        }


        //nullify column
        for (int j = 0; j < matrix[0].length; j++){
            if(column[j]){
                nullifyColumn(matrix,j);

            }
        }
    }

    public void nullifyRow(int[][] matrix, int row ){
        for(int j = 0; j < matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    public void nullifyColumn(int[][] matrix, int column){
        for (int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
    }

}
