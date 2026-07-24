public class spaceDiamond
{
	public static void main(String[] args) {
/*
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * *
*/
		int n=5;
		int currentLineNo=1;
		int totalNoOfLines = n;
		int sp = 1;
		int stars = n/2 + 1;
		while(currentLineNo<=totalNoOfLines){
		    for(int i=1;i<=stars;i++){
		        System.out.print("* ");
		    }
		    for(int i=1;i<=sp;i++){
		        System.out.print("  ");
		    }
		    for(int i=1;i<=stars;i++){
		        System.out.print("* ");
		    }
		    System.out.println();
		    
		    if(currentLineNo<=n/2){
		        stars--;
		        sp+=2;
		    }
		    else{
		        stars++;
		        sp-=2;
		    }
		    currentLineNo++;
		}
	}
}