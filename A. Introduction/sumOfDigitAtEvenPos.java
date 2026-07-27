import java.util.*;

public class sumOfDigitAtEvenPos {

    public static int sumOfEvenDigits(int n){
        int len = 0;
        int temp = n;
        while(temp>0){
            temp/=10;
            len++;
        }
        int countSum = 0;
        while(n>0){
            int ld = n%10;
            if(len%2==0){
                countSum += ld;
            }
            n/=10;
            len--;
        }
        return countSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOfEvenDigits(n);
        System.out.println(ans);
        sc.close();
    }
}
