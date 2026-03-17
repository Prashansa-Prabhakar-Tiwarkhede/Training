import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        int n = sc.nextInt();
double result = Math.round(num * Math.pow(10, n)) / Math.pow(10, n);

System.out.println(result);
        sc.close();
    }
}
