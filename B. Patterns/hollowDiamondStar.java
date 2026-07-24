public class hollowDiamondStar
{
	public static void main(String[] args) {
/*
    * 
  *   * 
*       * 
  *   * 
    * 
*/
		int n=5;
		int currentLineNo=1;
		int totalNoOfLines = n;
		int outSp = n/2;
		int inSp = -1;
		
		while(currentLineNo<=totalNoOfLines){
		    for(int i=1;i<=outSp;i++){
		        System.out.print("  ");
		    }
		    System.out.print("* ");
		    for(int i=1;i<=inSp;i++){
		        System.out.print("  ");
		    }
		    if(currentLineNo!=1 && currentLineNo!=n){
		        System.out.print("* ");
		    }
		    System.out.println();
		    if(currentLineNo<=n/2){
		        outSp--;
		        inSp+=2;
		    }
		    else{
		        outSp++;
		        inSp-=2;
		    }
		    currentLineNo++;
		}
	}
}