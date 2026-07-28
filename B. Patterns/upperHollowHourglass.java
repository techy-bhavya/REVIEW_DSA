public class upperHollowHourglass
{
    public static void printPattern(int n){
        int stars = n;
        int sp = 0;
        int currentLineNo = 1;
        int totalNoOfLines = n;
        while(currentLineNo<=totalNoOfLines){
            for(int i=1;i<=sp;i++){
                System.out.print("  ");
            }
            
            for(int i=1;i<=stars;i++){
                if(currentLineNo>1 && currentLineNo<=n/2 && i>1 && i<stars){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            
            System.out.println();
            if(currentLineNo<=n/2){
                stars-=2;
                sp++;
            }
            else{
                stars +=2;
                sp--;
            }
            currentLineNo++;
        }
    }
    
	public static void main(String[] args) {
		printPattern(7);
	}
}
