import java.util.Scanner;

class Sixth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Now first number is : "+ num1 +"\nAnd second number is : "+num2);

    }
}