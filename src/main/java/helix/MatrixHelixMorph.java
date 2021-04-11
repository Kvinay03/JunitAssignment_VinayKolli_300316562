package helix;

import java.util.ArrayList;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {
        int[][] matrix2;

        int rows = inMatrix.length;
        int columns = inMatrix[0].length;

        matrix2 = new int[rows][columns];

        int array[] = new int[rows*columns];

        int k=0;
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                array[k] = inMatrix[i][j];
                k++;
            }
        }
        int r = 0, c = 0;
        k = 0;
        while (r<rows && c<columns){
            for(int i=c;i<columns;i++){
                matrix2[r][i] = array[k];
                k++;
            }
            r++;
            for(int i=r;i<rows;i++){
                matrix2[i][columns-1] = array[k];
                k++;
            }
            columns--;
            if (r<rows){
                for(int i=columns-1;i>=c;i--){
                    matrix2[rows-1][i] = array[k];
                    k++;
                }
                rows--;
            }
            if (c<columns){
                for(int i = rows-1;i>=r;i--){
                    matrix2[i][c] = array[k];
                    k++;
                }
                c++;
                }
            }
            return matrix2; //MODIFY THIS METHOD
    }
}