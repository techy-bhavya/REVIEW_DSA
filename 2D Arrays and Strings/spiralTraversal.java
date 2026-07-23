public class spiralTraversal
{
    public static void printspiralTraversal(int[][] mat){
        int sr = 0;
        int sc = 0;
        int er = mat.length - 1;
        int ec = mat[0].length - 1;
        
        while(sr<=er && sc <= ec){
            for(int row = sr;row<=er;row++){
                System.out.print(mat[row][sc] + " ");
            }
            sc++;
            if(sr<=er && sc<=ec){
                for(int col = sc;col<=ec;col++){
                    System.out.print(mat[er][col] + " ");
                }
                er--;
            }
            if(sr<=er && sc<=ec){
                for(int row = er;row>=sr;row--){
                    System.out.print(mat[row][ec] + " ");
                }
                ec--;
            }
            if(sr<=er && sc<=ec){
                for(int col = ec;col>=sc;col--){
                    System.out.print(mat[sr][col] + " ");
                }
                sr++;
            }
        }
        
    }
    
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0,1,0,0},
		                  {0,1,0,0,0,0},
		                  {1,0,1,0,1,0},
		                  {0,1,0,1,1,0},
		                  {0,0,0,0,0,1}};

//spiral traversal -> anti clockwise
// 0 0 1 0 0 0 0 0 0 1 0 0 0 0 0 1 0 0 1 0 1 0 1 1 1 0 0 0 1 0 
		printspiralTraversal(matrix);
	}
}


