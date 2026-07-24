import java.util.*;

public class ExitPoint
{
    public static List<Integer> printExitPoint(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        
        int row=0;
        int col=0;
        int dir=0;
        while(row>=0 && row<n && col>=0 && col<m){
            if(mat[row][col]==1){
                dir = (dir+1)%4;
                mat[row][col]=0; // Mark the cell as 0 to avoid infinite loop
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
        
        //Return to last valid cell: in comments: simpler conditions
        if(dir==0){ //col==n
            col--;
        }
        else if(dir==1){//row==n
            row--;
        }
        else if(dir==2){//col<0
            col++;
        }
        else{//row<0
            row++;
        }
        List<Integer> al = new ArrayList<>();
        al.add(row);
        al.add(col);
        return al;
    }
    
    
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0,1,0,0},
		                  {0,1,0,0,0,0},
		                  {1,0,1,0,1,0},
		                  {0,1,0,1,1,0},
		                  {0,0,0,0,0,1}};
		System.out.println(printExitPoint(matrix));
	}
}