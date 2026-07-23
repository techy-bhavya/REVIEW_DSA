public class fiboRightTriangle
{
	public static void main(String[] args) {
/*
1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 
*/
		int n=5;
		int currentLineNo=1;
		int totalNoOfLines = n;
		int stars = 1;
		int a=1;
		int b=1;
		while(currentLineNo<=totalNoOfLines){
		    for(int i=1;i<=stars;i++){
		        System.out.print(a+" ");
		        int c = a+b;
		        a=b;
		        b=c;
		        
		    }
		    System.out.println();
		    stars++;
		    currentLineNo++;
		}
	}
}