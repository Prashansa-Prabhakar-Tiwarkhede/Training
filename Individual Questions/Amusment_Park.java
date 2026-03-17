
import java.util.Scanner;

public class Amusment_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        dp[0][0] = Math.max(1, grid[0][0]);

        for(int j = 1; j < m; j++){
            dp[0][j] = Math.max(dp[0][j-1], grid[0][j]);
        }

        for(int i = 1; i < n; i++){
            dp[i][0] = Math.max(dp[i-1][0], grid[i][0]);
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                int fromTop = Math.max(dp[i-1][j], grid[i][j]);
                int fromLeft = Math.max(dp[i][j-1], grid[i][j]);

                dp[i][j] = Math.min(fromTop, fromLeft);
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}