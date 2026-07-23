public class ExitPoint
{
    public static void printExitPoint(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        
        int row=0;
        int col=0;
        int dir=0;
        while(row>=0 && row<n && col>=0 && col<m){
            if(mat[row][col]==1){
                dir = (dir+1)%4;
            }
            if(dir==0){
                col++;
            }
            else if(dir==1){
                row++;
            }
            else if(dir==2){
                col--;
            }
            else{
                row--;
            }
        }
        
        //Return to last valid cell
        if(dir==0){
            col--;
        }
        else if(dir==1){
            row--;
        }
        else if(dir==2){
            col++;
        }
        else{
            row++;
        }
        System.out.print("Exit Point: "+row +", "+col);
    }
    
    
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0,1,0,0},
		                  {0,1,0,0,0,0},
		                  {1,0,1,0,1,0},
		                  {0,1,0,1,1,0},
		                  {0,0,0,0,0,1}};
		printExitPoint(matrix);
	}
}