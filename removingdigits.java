import java.util.*;
public class removingdigits {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = help(n);
        System.out.println(ans);
    }
    public static int help(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0; 

        for (int i = 1; i <= n; i++) {
            int current = i;
            while (current > 0) {
                int digit = current % 10;
                current /= 10;

                if (digit > 0) {
                    dp[i] = Math.min(dp[i], dp[i - digit] + 1);
                }
            }
        }
        return dp[n];
    }
}
