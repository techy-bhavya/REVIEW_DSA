public class RotateNumberLeftRight
{
    public static void printLeftRotatedNumber(int n, int k){
        if (n == 0) {
        System.out.println(0);
        return;
        }
        int len = 0;
        int temp=n;
        while(temp>0){
            temp/=10;
            len++;
        }
        k = k%len;
        if(k<0){
            k+=len;
        }
        
        int divisor = (int)Math.pow(10,len-k); //1000
        int multiplier = (int)Math.pow(10,k); //100
        
        int firstPart = n%divisor;
        int remainingPart = n/divisor;
        int ans = firstPart * multiplier + remainingPart;
        System.out.println(ans);
    }
    
    public static void printRightRotatedNumber(int n, int k){
        if (n == 0) {
        System.out.println(0);
        return;
        }
        int len = 0;
        int temp=n;
        while(temp>0){
            temp/=10;
            len++;
        }
        k = k%len;
        if(k<0){
            k+=len;
        }
        
        int divisor = (int)Math.pow(10,k); //100
        int multiplier = (int)Math.pow(10,len-k); //1000
        
        int lastPart = n%divisor;
        int remainingPart = n/divisor;
        int ans = lastPart * multiplier + remainingPart;
        System.out.println(ans);
    }
    
	public static void main(String[] args) {
		printLeftRotatedNumber(12345,2); //34512
        printRightRotatedNumber(12345,2); //45123
	}
}