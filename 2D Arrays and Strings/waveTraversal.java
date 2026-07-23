public class waveTraversal
{
    public static void printWaveTraversal(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        
        for(int j=0;j<m;j++){
            if(j%2==0){
                //Even Column: Top to Bottom Print
                for(int i=0;i<n;i++){
                    System.out.print(mat[i][j] + " ");
                }
            }
            else{
                //Odd Column: Bottom to Top Print
                for(int i=n-1;i>=0;i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
        
    }
    
    
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0,1,0,0},
		                  {0,1,0,0,0,0},
		                  {1,0,1,0,1,0},
		                  {0,1,0,1,1,0},
		                  {0,0,0,0,0,1}};
		                  
		                  //0 0 1 0 0 
                          //0 1 0 1 0 
                          //0 0 1 0 0 
                          //0 1 0 0 1 
                          //0 0 1 1 0 
                          //1 0 0 0 0 
		printWaveTraversal(matrix);
	}
}