public class upperButterflyStarIncDecNo
{
	public static void main(String[] args) {
/*
1               1 
1 2           2 1 
1 2 3       3 2 1 
1 2 3 4   4 3 2 1 
1 2 3 4 5 4 3 2 1
*/
		int n=5;
		int currentLineNo=1;
		int totalNoOfLines = n;
		int sp = 2*n - 3;
		int stars = 1;
		
		while(currentLineNo<=totalNoOfLines){
		    int startNum = 1;
		    for(int i=1;i<=stars;i++){
		        System.out.print(startNum+" ");
		        startNum++;
		    }
		    startNum--;
		    for(int i=1;i<=sp;i++){
		        System.out.print("  ");
		    }
		    if(currentLineNo==totalNoOfLines){
		        stars--;
		    }
				if(currentLineNo==totalNoOfLines){
					startNum--;
				}
		    for(int i=1;i<=stars;i++){
		        System.out.print(startNum+" ");
		        startNum--;
		    }
		    System.out.println();
		    
		    stars++;
		    sp-=2;
		    currentLineNo++;
		}
	}
}
