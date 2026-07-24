public class addTwoArrays
{
    public static void printArray(int[] arr){
        int start = 0;
        if (arr[0]==0)
            start = 1;
        
        for(int i=start;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static void addArrays(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int[] res = new int[Math.max(n1,n2) + 1];//+1 for carry
        int i = n1-1;
        int j = n2-1;
        int k = res.length - 1;
        int carry = 0;
        while(k>=0){
            int colSum = carry;
            if(i>=0){
                colSum += arr1[i];
            }
            if(j>=0){
                colSum += arr2[j];
            }
            res[k] = colSum%10;
            carry = colSum/10;
            
            i--;
            j--;
            k--;
        }
        printArray(res);
    }
    
    
	public static void main(String[] args) {
		int[] x = {9,9,9};
		int[] y = {1};
		addArrays(x,y);
	}
}

