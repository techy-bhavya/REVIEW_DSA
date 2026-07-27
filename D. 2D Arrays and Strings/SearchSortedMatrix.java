public class SearchSortedMatrix
{
    public static boolean sortedMatrixSearch(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        
        int row = 0;
        int col = m-1;
        
        while(row<n && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
    
	public static void main(String[] args) {
		int[][] matrix = {{1,5,8,11,19},
		                  {2,10,12,21,22},
		                  {29,40,45,48,68},
		                  {35,46,53,98,101},
		                  {37,51,54,110,120}};
		int target = 53;
		System.out.println(sortedMatrixSearch(matrix, target));
	}
}

