class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1; // initially taking col-0 as 1
        for(int i=0;i<matrix.length;i++){ //for rows
            for(int j=0;j<matrix[0].length;j++){ //for cols
                if(matrix[i][j]==0){ //if one cell is 0
                    matrix[i][0]=0; // assign that row as 0
                    if(j!=0){ //if j is not 0
                        matrix[0][j]=0; //assign that col as 0
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1; i<matrix.length ;i++){ //iterates from index 1
            for(int j=1;j<matrix[0].length;j++){ //iterates from index 1
                if(matrix[i][j]!=0){ //if the cell is not zero
                    if(matrix[i][0]==0 || matrix[0][j]==0){ //checks if any other element of that row and column is zero or not
                        matrix[i][j]=0; //assign the cell as zero then
                    }
                }
                
            }
        }
        if(matrix[0][0]==0){ //first cell is zero
            for(int j=0;j<matrix[0].length;j++){ 
                matrix[0][j]=0; //assign the first column as zero
            }
        }
        if(col0==0){ // if col0 is zero
            for(int i=0; i<matrix.length;i++){
                matrix[i][0]=0; //assign the first row as zero
            }
        }
        //return matrix;
    }
}
