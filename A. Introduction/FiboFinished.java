public class FiboFinished
{
    public static void printNFibonacciTerms(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int c =a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
    
    //n numbers k liye F(0) = 0
    /*
    F(1) = 0
    F(2) = 1
    F(3) = 1
    F(4) = 2
    F(5) = 3
    F(6) = 5
    F(7) = 8
    F(8) = 13
    F(9) = 21
    F(10) = 34
    
    agar loop khatm hone k baad print karunga, toh 55 print hoga,
    coz next no has been assigned to a
    */
    
    public static void printNthFibonacciTerm1Based(int n){
        int a=0;
        int b=1;
        for(int i=1;i<n;i++){//1 based indexing prints 34
            int c =a+b;
            
            a=b;
            b=c;
        }
        System.out.println(a);
    }
    
    /*
    F(1) = 0
    F(2) = 1
    F(3) = 1
    F(4) = 2
    F(5) = 3
    F(6) = 5
    F(7) = 8
    F(8) = 13
    F(9) = 21
    and fir loop khatm hone k baad, next no, ie 34 is assigned to a,
    and hence gets printed!
    */
    
    public static void printNthFibonacciTerm0Based(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){//0 based indexing prints 55
            int c =a+b;
            
            a=b;
            b=c;
        }
        System.out.println(a);
    }
    
    /*
    F(0) = 0
    F(1) = 1
    F(2) = 1
    F(3) = 2
    F(4) = 3
    F(5) = 5
    F(6) = 8
    F(7) = 13
    F(8) = 21
    F(9) = 34
    and fir loop khatm hone k baad, next no, ie 55 is assigned to a,
    and hence gets printed!
    */
    
    
	public static void main(String[] args) {
		printNFibonacciTerms(10);
		printNthFibonacciTerm1Based(10); //34
		printNthFibonacciTerm0Based(10); //55
		
	}
}