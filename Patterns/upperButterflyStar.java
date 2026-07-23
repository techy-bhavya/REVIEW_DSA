public class upperButterflyStar
{
	public static void main(String[] args) {
/*
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 
*/
		int n=5;
		int currentLineNo=1;
		int totalNoOfLines = n;
		int sp = 2*n - 3;
		int stars = 1;
		while(currentLineNo<=totalNoOfLines){
		    for(int i=1;i<=stars;i++){
		        System.out.print("* ");
		    }
		    for(int i=1;i<=sp;i++){
		        System.out.print("  ");
		    }
		    if(currentLineNo==totalNoOfLines){
		        stars--;
		    }
		    for(int i=1;i<=stars;i++){
		        System.out.print("* ");
		    }
		    System.out.println();
		    
		    stars++;
		    sp-=2;
		    currentLineNo++;
		}
	}
}