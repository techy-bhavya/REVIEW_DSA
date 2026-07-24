import java.util.*;

public class nextGreaterElement
{
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void printNextGreterElement(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int currentElement = arr[i];
            while(st.size()>0 && st.peek()<= currentElement){
                st.pop();
            }
            if(st.size()==0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(currentElement);
        }
        printArray(nge);
    }
    
    
	public static void main(String[] args) {
		int[] arr = {15,10,20,12,17};
		printNextGreterElement(arr);
	}
}



