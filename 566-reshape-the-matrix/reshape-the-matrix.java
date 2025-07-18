class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;
        int[][] res=new int[r][c];
        if(rows*cols!=r*c){
            return mat;
        }
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int row=index/c;
                int col=index%c;
                res[row][col]=mat[i][j];
                index++;
            }
        }
        return res;
    }
}