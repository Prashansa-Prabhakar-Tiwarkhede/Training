import java.util.Scanner;

public class Company_Sales {

    public static int min_wgt(int[][] arr, int n, int m, int current_wgt){
        current_wgt = Math.max(current_wgt, arr[n][m]);
        if(n==n-1 && m==m-1){
            return current_wgt;
        }
        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        if(m+1<m){
            right = min_wgt(arr, n, m+1, current_wgt);
        }
        if(n+1 < n){
            down = min_wgt(arr, n+1, m, current_wgt);
        }
        return Math.min(right, down);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int result = min_wgt(arr, n, m , 1);
        System.out.println(result);
    }
}
