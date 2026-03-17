import java.util.Scanner;

public class Second {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();

        int num3 = num1 + num2;
        System.out.println("Addition is : "+num3);
    }    
}
