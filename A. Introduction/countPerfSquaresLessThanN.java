import java.util.*;

public class countPerfSquaresLessThanN {

    public static boolean isPerfectSquare(int n){
        int root = (int)Math.sqrt(n);
        return root * root == n;
    }

    public static int printNoOfPerfectSquares(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(isPerfectSquare(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = printNoOfPerfectSquares(sc.nextInt());
        System.out.println(ans);
        sc.close();
    }
}
