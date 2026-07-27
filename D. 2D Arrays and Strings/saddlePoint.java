public class saddlePoint
{//Saddle Point: Minimum in its row, Maximum in its column
    public static void findSaddlePoint(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        
        for(int i=0;i<rows;i++){
            int minElementCol = 0; //minimum element in row ka column
            for(int j=1;j<cols;j++){
                if(arr[i][j]<arr[i][minElementCol]){
                    minElementCol = j;
                }
            }
            
            boolean isSaddlePoint = true;
            
            for(int row=0;row<rows;row++){
                if(arr[row][minElementCol] > arr[i][minElementCol]){
                    isSaddlePoint = false;
                    break;
                }
            }
            if(isSaddlePoint){
                System.out.println("Saddle Point: " + arr[i][minElementCol]);
                return;
            }
        }
        System.out.println("No saddle point");
    }
    
	public static void main(String[] args) {
		int[][] matrix = {{1,5,8,11,19},
		                  {2,10,12,21,22},
		                  {29,40,45,48,68},
		                  {35,46,53,98,101},
		                  {37,51,54,110,120}};
		findSaddlePoint(matrix);
	}
}