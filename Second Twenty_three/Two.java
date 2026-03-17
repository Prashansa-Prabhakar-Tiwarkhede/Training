import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Negative number!");
        }
        else if(num == 0){
            System.out.println("You entered Zero!");
        }
        else if(num > 0){
            System.out.println("Positive number!");
        }
        else{
            System.out.println("Invalid Input!");
        }
        sc.close();
    }
}
