public class dublew
{
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("* ");
                }
                else if(i>=n/2 && (i==j || i+j==n-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		printPattern(5);
	}
}