import java.util.*;

public class maxSubarraySumProblems
{
        public static void maxSubarrayBigO_n3(int[] arr){
        int maxSum = Integer.MIN_VALUE;
 		for(int si=0;si<arr.length;si++){
 		    for(int ei=si;ei<arr.length;ei++){
 		        int curSum=0;
 		        //subarray shuru hone se pehle initialize karliya
 		        //har subarray k start mein 0 ho jaega
 		        for(int k=si;k<=ei;k++){//subarray starts
 		            curSum += arr[k];//har ek element ka sum calculate 
 		            //karlega aur curSum mein daal dega, which represents
 		            //sum of this subarray
 		        }
 		        //now when the subarray is finished, we check if this sum,
 		        //is greater than previous max sum and update accordingly.
 		        if(curSum>maxSum){
 		            maxSum = curSum;
 		        }
 		    }
 		}
 		System.out.println(maxSum);
    }
    
    public static void maxSubarrayBigO_n2(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int si=0;si<arr.length;si++){
            int curSum=0;
            for(int ei=si;ei<arr.length;ei++){
                //start value fix h, and har ek naye element k corresponding
                //naye subarray ka sum calculate ho rha h, and agar koi 
                //bada aa rha h, toh maxSum voh ban ja rha h, simple!
                //Eventually, start value ek ek karke aage badh rha h, 
                //uss wale ka sab check karne k baad.
                curSum += arr[ei];
                if(curSum>maxSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    
    public static void maxSubarrayBigO_n(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(maxSum<curSum){
                maxSum = curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        System.out.println(maxSum);
    }
    
    public static int maxSubArrayWithIndices(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int curSum=0;
        int curStart = 0;
        int maxStart = -1;
        int maxEnd = -1;
        for(int i=0;i<arr.length;i++){
            curSum += arr[i];
            if(maxSum<curSum){
                maxSum = curSum;
                maxStart = curStart;
                maxEnd = i;
            }
            if(curSum<0){
                curSum = 0;
                curStart = i + 1;
            }
        }
        System.out.println("Starting index: "+ maxStart);
        System.out.println("Ending index: "+ maxEnd);
        return maxSum;
    }
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 		int[] arr = {3,4,6,5,8};
 		maxSubarrayBigO_n3(arr);
        sc.close();
	}
}

