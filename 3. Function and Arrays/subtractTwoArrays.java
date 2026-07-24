public class subtractTwoArrays
{
    public static void printArray(int[] arr) {
        int start = 0;
        //The condition start < arr.length - 1 ensures 
        //that a result of zero still prints one 0.
        while (start < arr.length - 1 && arr[start] == 0) {
            start++;
        }
    
        for (int i = start; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void subtractArrays(int[] arr1, int[] arr2){
        //arr2 is always bigger
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = n1-1;
        int j = n2-1;
        int[] res = new int[n2];
        int n3 = res.length;
        int k = n3 - 1;
        int borrow = 0;
        while(k>=0){
            int smallDigit = 0;
            if(i>=0){
                smallDigit = arr1[i];
            }
            int difference = arr2[j] - borrow - smallDigit;
            if(difference<0){
                difference+=10;
                borrow=1;//borrow ko 1 set kardiya for next iteration
            }
            else{
                borrow=0;
            }
            res[k] = difference;
            
            i--;
            j--;
            k--;
        }
        printArray(res);
        
    }
    
	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {9,4,2};
		subtractArrays(arr1,arr2);
	}
}