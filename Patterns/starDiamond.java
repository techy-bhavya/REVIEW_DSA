public class starDiamond
{
	public static void main(String[] args) {
/*
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
*/
		int n=3;
		int currentLineNo=1;
		int totalNoOfLines = 2*n + 1;
		int sp = n;
		int stars = 1;
		while(currentLineNo<=totalNoOfLines){
		    for(int i=1;i<=sp;i++){
		        System.out.print("  ");
		    }
		    for(int i=1;i<=stars;i++){
		        System.out.print("* ");
		    }
		    System.out.println();
		    
		    if(currentLineNo<=n){
		        stars+=2;
		        sp--;
		    }
		    else{
		        stars -= 2;
		        sp++;
		    }
		    currentLineNo++;
		}
	}
}