import java.util.*;

public class butterfly {

    public static void printPattern(int n){
        int stars = 1;
        int sp = n-2;
        int currentLineNo = 1;
        int totalNoOfLines = n;
        while(currentLineNo<=totalNoOfLines){
            
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }
            for(int i=1;i<=sp;i++){
                System.out.print(" ");
            }
            // int newStars = stars;
            // if(currentLineNo==n/2 + 1){
            //     newStars-=2;
            //     for(int i=1;i<=newStars;i++){
            //         System.out.print("*");
            //     }
            // }
            // else{
            //     for(int i=1;i<=stars;i++){
            //         System.out.print("*");
            //     }
            // }
            if(currentLineNo==n/2 + 1){
                stars--;
            }
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }
            if(currentLineNo==n/2 + 1){
                stars++;
            }
            
            System.out.println();
            if(currentLineNo<=n/2){
                stars++;
                sp-=2;
            }
            else{
                stars--;
                sp+=2;
            }
            
            currentLineNo++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printPattern(sc.nextInt());
        sc.close();
    }
}
