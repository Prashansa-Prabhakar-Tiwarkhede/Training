import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int or = num;
        int rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(or == rev){
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}