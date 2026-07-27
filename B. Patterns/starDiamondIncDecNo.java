import java.util.*;

public class starDiamondIncDecNo
{

    /*
    
n = 2

    1 
  2 3 2 
3 4 5 4 3 
  2 3 2 
    1 

    */

    public static void printPattern(int n){
        int sp = n;
        int stars = 1;
        int currentLineNo = 1;
        int totalNoOfLines = 2*n + 1;
        int startNum = 1;
        while(currentLineNo<=totalNoOfLines){
            
            for(int i=1;i<=sp;i++){
                System.out.print("  ");
            }
            int num = startNum;
            for(int i=1;i<=stars;i++){
                System.out.print(num+" ");
                if(i<=stars/2){
                    num++;
                }
                else{
                    num--;
                }
            }
            
            System.out.println();
            if(currentLineNo<=n){
                sp--;
                stars+=2;
                startNum++;
            }
            else{
                sp++;
                stars-=2;
                startNum--;
            }
            
            currentLineNo++;;
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printPattern(sc.nextInt());
        sc.close();
	}
}

