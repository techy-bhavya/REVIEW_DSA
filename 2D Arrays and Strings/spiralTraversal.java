import java.util.*;

public class spiralTraversal
{
    public static List<Integer> printACWSpiralTraversal(int[][] mat){
        int sr = 0;
        int sc = 0;
        int er = mat.length - 1;
        int ec = mat[0].length - 1;
        List<Integer> al = new ArrayList<>();
        
        while(sr<=er && sc <= ec){
            for(int row = sr;row<=er;row++){
                al.add(mat[row][sc]);
            }
            sc++;
            if(sr<=er && sc<=ec){
                for(int col = sc;col<=ec;col++){
                    al.add(mat[er][col]);
                }
                er--;
            }
            if(sr<=er && sc<=ec){
                for(int row = er;row>=sr;row--){
                    al.add(mat[row][ec]);
                }
                ec--;
            }
            if(sr<=er && sc<=ec){
                for(int col = ec;col>=sc;col--){
                    al.add(mat[sr][col]);
                }
                sr++;
            }
        }
        return al;
        
    }
    
    public static List<Integer> printCWSpiralTraversal(int[][] mat){
        int sr = 0;
        int sc = 0;
        int er = mat.length - 1;
        int ec = mat[0].length - 1;
        List<Integer> al = new ArrayList<>();
        
        while(sr<=er && sc <= ec){
            for(int col = sc;col<=ec;col++){
                al.add(mat[sr][col]);
            }
            sr++;
            if(sr<=er && sc<=ec){
                for(int row = sr;row<=er;row++){
                    al.add(mat[row][ec]);
                }
                ec--;
            }
            if(sr<=er && sc<=ec){
                for(int col = ec;col>=sc;col--){
                    al.add(mat[er][col]);
                }
                er--;
            }
            if(sr<=er && sc<=ec){
                for(int row = er;row>=sr;row--){
                    al.add(mat[row][sc]);
                }
                sc++;
            }
        }
        return al;
        
    }
    
	public static void main(String[] args) {
		int[][] matrix = {{0,0,0,1,0,0},
		                  {0,1,0,0,0,0},
		                  {1,0,1,0,1,0},
		                  {0,1,0,1,1,0},
		                  {0,0,0,0,0,1}};
/*
ACW: [0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 
0, 1, 1, 1, 0, 0, 0, 1, 0]

CW: [0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 
0, 1, 1, 1, 0, 1, 0, 1, 0]
*/
		System.out.println("ACW: " + printACWSpiralTraversal(matrix));
		System.out.println();
		System.out.println("CW: " + printCWSpiralTraversal(matrix));
	}
}


