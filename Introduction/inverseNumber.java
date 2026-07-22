public class inverseNumber
{
    public static void printInverse(int n){
        int inv = 0;
        int pos=1;
        while(n>0){//n>=0 won't work, coz once n reaches 0
        //n/=10 keeps it at 0, and infinite loop occurs
            int lastDigit = n%10;
            inv = inv + pos * (int)Math.pow(10,lastDigit-1);
            n/=10;
            pos++;
        }
        System.out.println(inv);
    }
    
	public static void main(String[] args) {
		printInverse(3214); //1432 
		//we start pos from right hand side
		//1st posn mein 4, so inverse k 4th pos mein 1
		//2nd posn mein 1, so inverse k 1st position mein 2
	}
}

