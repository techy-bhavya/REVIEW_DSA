public class hcfLcm
{
    public static void gcdLcm(int a, int b){
        int n1=a;
        int n2=b;
        while(a!=0){
            int rem = b%a;
            b=a;
            a=rem;
        }
        System.out.println("GCD: "+b);
        int lcm = n1*n2/b;
        System.out.println("LCM: "+lcm);
    }
    
	public static void main(String[] args) {
		gcdLcm(12,15);
	}
}







