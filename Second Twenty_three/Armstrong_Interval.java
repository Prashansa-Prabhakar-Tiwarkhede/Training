import java.util.Scanner;

public class Armstrong_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int num = start; num <= end; num++){

            int original = num;
            int sum = 0;

            int temp = num;
            int digits = 0;
            while(temp != 0){
                temp /= 10;
                digits++;
            }

            temp = num;
            while(temp != 0){
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if(sum == original){
                System.out.print(num + " ");
            }
        }
    }
}