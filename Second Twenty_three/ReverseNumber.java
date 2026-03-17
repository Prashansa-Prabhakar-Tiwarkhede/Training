import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;

        while(num != 0){
            int digit = num % 10;   // get last digit
            rev = rev * 10 + digit; // add to reversed number
            num = num / 10;         // remove last digit
        }

        System.out.println("Reversed number = " + rev);
    }
}