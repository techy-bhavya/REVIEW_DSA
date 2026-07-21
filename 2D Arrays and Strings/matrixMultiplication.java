public class matrixMultiplication
{
    public static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void multiplyMatrices(int[][] arr1, int[][] arr2){
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        
        if(c1!=r2){
            System.out.println("Matrices cannot be multiplied.");
            return;
        }
        
        int[][] res = new int[r1][c2];
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int curSum = 0;
                for(int k=0;k<c1;k++){
                    curSum += arr1[i][k] * arr2[k][j];
                }
                res[i][j] = curSum;
            }
        }
        printMatrix(res);
    }
    
    
	public static void main(String[] args) {
		int[][] arr1 = {{2,3},
		                {3,5}};
		                
		int[][] arr2 = {{3,6},
		                {4,9}};
		                
		multiplyMatrices(arr1, arr2);
	}
}