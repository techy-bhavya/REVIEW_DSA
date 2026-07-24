import java.util.*;

public class arrayReverseRotateShit
{
    public static void reversePartOfArray(int[] arr, int left, int right){
        while(left<right){
            swapValues(arr, left, right);
            left++;
            right--;
        }
    }
    
    public static void rotateArray(int[] arr, int k){
        if(arr==null || arr.length==0)
            return;
        int n = arr.length;
        k = k%n;
        if(k<0)
            k+=n;
        // Right Rotate : reverse whole, reverse first k, reverse remaining
        // reversePartOfArray(arr, 0, n-1);
        // reversePartOfArray(arr, 0, k-1);
        // reversePartOfArray(arr, k, n-1);
        
        // Left Rotate : reverse first k, reverse remaining, reverse whole
        reversePartOfArray(arr, 0, k-1);
        reversePartOfArray(arr, k, n-1);
        reversePartOfArray(arr, 0, n-1);
    }
    
    
    public static void swapValues(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // public static void reverseArray(int[] arr){
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while(left<right){
    //         swapValues(arr, left, right);
    //         left++;
    //         right--;
    //     }
    // }
    
    // public static void reverseArray2(int[] arr){
    //     int n = arr.length;
    //     for(int i=0;i<n/2;i++){
    //         int temp = arr[i];
    //         arr[i] = arr[n-i-1];
    //         arr[n-i-1] = temp;
    //     }
    // }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,4,6,5,8};
		rotateArray(arr,2);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i] + " ");
		}
        sc.close();
	}
}