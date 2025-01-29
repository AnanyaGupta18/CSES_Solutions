import java.util.*;
public class coinCombination1 {
    static final int MOD = 1000000007;

    public static int countWays(int n, int x, int[] coins) {
        int[] dp = new int[x + 1];
        dp[0] = 1; 

        for (int i = 1; i <= x; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = (dp[i] + dp[i - coin]) % MOD;
                }
            }
        }

        return dp[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Coins
        int x = sc.nextInt(); // Sum

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println(countWays(n, x, coins));

        sc.close();
    }
}
