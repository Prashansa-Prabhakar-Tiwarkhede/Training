import java.util.Scanner;

public class Third {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1 : ");
    float num1 = sc.nextFloat();
    System.out.println("Enter number 2 : ");
    float num2 = sc.nextFloat();
    float num3  = num2*num1;

    System.out.println("Multiplication is : "+num3);
    }
}
