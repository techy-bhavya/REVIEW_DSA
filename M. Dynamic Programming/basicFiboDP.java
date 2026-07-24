public class basicFiboDP {

  // Iterative Fibonacci
  public static int fibonacciIterative(int n) {
      validateInput(n);

      if (n == 0) {
          return 0;
      }

      int a = 0;
      int b = 1;

      for (int i = 2; i <= n; i++) {
          int c = a + b;
          a = b;
          b = c;
      }

      return b;
  }

  // Basic recursive Fibonacci
  public static int fibonacciRecursive(int n) {
      validateInput(n);

      if (n == 0 || n == 1) {
          return n;
      }

      return fibonacciRecursive(n - 1)
              + fibonacciRecursive(n - 2);
  }

  // Memoization wrapper
  public static int fibMemo(int n) {
      validateInput(n);

      int[] memo = new int[n + 1];

      if (n >= 1) {
          memo[1] = 1;
      }

      return fibMemo(n, memo);
  }

  // Memoization helper
  private static int fibMemo(int n, int[] memo) {
      if (n == 0 || n == 1) {
          return n;
      }

      if (memo[n] != 0) {
          return memo[n];
      }

      memo[n] = fibMemo(n - 1, memo)
              + fibMemo(n - 2, memo);

      return memo[n];
  }

  // Tabulation
  public static int fibTab(int n) {
      validateInput(n);

      if (n == 0) {
          return 0;
      }

      int[] dp = new int[n + 1];

      dp[0] = 0;
      dp[1] = 1;

      for (int i = 2; i <= n; i++) {
          dp[i] = dp[i - 1] + dp[i - 2];
      }

      return dp[n];
  }

  // Space-optimized tabulation
  public static int fibMostOptimized(int n) {
      validateInput(n);

      if (n == 0) {
          return 0;
      }

      int a = 0;
      int b = 1;

      for (int i = 2; i <= n; i++) {
          int c = a + b;
          a = b;
          b = c;
      }

      return b;
  }

  private static void validateInput(int n) {
      if (n < 0) {
          throw new IllegalArgumentException(
                  "Fibonacci index cannot be negative"
          );
      }
  }

  public static void main(String[] args) {
      int n = 10;
      // 0 is considered as 0th term, 1 as 1st term, 1 as 2nd term 
      //and so on
      System.out.println(fibonacciIterative(n)); // 55
      System.out.println(fibonacciRecursive(n)); // 55
      System.out.println(fibMemo(n));             // 55
      System.out.println(fibTab(n));              // 55
      System.out.println(fibMostOptimized(n));    // 55
  }
}