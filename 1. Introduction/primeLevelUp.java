public class primeLevelUp
{
    public static void isPrimeBasic(int n){
        int fact_count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fact_count++;
            }
        }
        if(fact_count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
    public static boolean isPrimeGood(int n){
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++){//better condition: i<=n/i
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPrimeAdv(int n){
        if(n<=1)  
            return false; 
            
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
          
        //prime nos are of the form 6k +- 1(necessary, not sufficient),  
        //therefore, checking all nos of this form
        //upto root n
        for(int i=5;i<=n/i;i+=6){
            if(n%i ==0  || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    
    public static void printPrimesUptoN(int n){
        for(int i=2;i<=n;i++){
            if(isPrimeAdv(i)){
                System.out.println(i);
            }
        }
    }
    
    public static void printPrimesUptoNSieveOfErato(int n){
        boolean[] isPrime = new boolean[n+1];
        //Initially assume every number is prime
        for(int i=2;i<=n;i++){
            isPrime[i] = true;
        }
        //Mark multiples as not prime
        for(int p=2;p<=n/p;p++){
            if(isPrime[p]){
                for(int multiple = p*p; multiple<=n;multiple+=p){
                    isPrime[multiple] = false;
                }
            }
        }
        
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }
    
	public static void main(String[] args) {
	//	isPrimeBasic(5);
	//	printPrimesUptoN(55);//O(n raised to the power 3/2)
		printPrimesUptoNSieveOfErato(100);//O(nlog(logn))
	}
}

