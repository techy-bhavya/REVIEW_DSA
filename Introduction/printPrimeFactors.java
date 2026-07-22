public class printPrimeFactors
{
    public static void printPrimeFactorsofN(int n){
        for(int factor = 2; factor*factor<=n;factor++){
            while(n%factor==0){
                System.out.println(factor);
                n = n/factor;
            }
        }
        if(n>1){//this is important, see in this case when n=14
            System.out.println(n);
        }
    }
    
	public static void main(String[] args) {
		printPrimeFactorsofN(14);
	}
}







