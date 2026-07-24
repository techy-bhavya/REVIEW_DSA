public class transpose
{
    public static void swapValues(int[][] mat, int x, int y){
        int temp = mat[x][y];
        mat[x][y] = mat[y][x];
        mat[y][x] = temp;
    }
    
    public static void inPlaceTranspose(int[][] mat){
        int n = mat.length; //no of rows = no of cols
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swapValues(mat, i, j);
            }
        }
    }
    
    public static void Transpose(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] res = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[j][i] = mat[i][j];
            }
        }
        printMatrix(res);
    }
    
    public static void printMatrix(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0,1,0},
		                  {0,1,0,0,0},
		                  {1,0,1,0,1},
		                  {0,1,0,1,1},
		                  {0,0,0,0,0}};
		                  
        inPlaceTranspose(matrix);
        printMatrix(matrix);
	}
}