public class rotate90CW
{
    public static void swapValuesof1Darray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swapValuesof1Darray(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void swapValuesof2Darray(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    
    public static void reverseEveryRow(int[][] matrix){
        int n = matrix.length;
        
        for(int i=0;i<n;i++){
            int[] row = matrix[i];
            reverseArray(row);
        }
    }
    
    public static void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swapValuesof2Darray(matrix, i, j);
            }
        }
    }

    public static void rotateNinetyCW(int[][] matrix){
        //Transpose, then reverse every row
        transpose(matrix);
        reverseEveryRow(matrix);
    }
    
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int[][] arr1 = {{2,2},{3,3}};
		rotateNinetyCW(arr1);
		printMatrix(arr1);
	}
}