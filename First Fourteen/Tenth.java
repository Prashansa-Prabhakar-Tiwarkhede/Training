import java.util.Scanner;

public class Tenth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of x^2 : ");
        int a = sc.nextInt();
        System.out.println("Enter coefficient of x^1 : ");
        int b = sc.nextInt();
        System.out.println("Enter constant value : ");
        int c = sc.nextInt();

        int c1 = (b*b)-(4*a*c);
        double c11 = Math.sqrt(c1);
        
        double root1 = (-b+c11)/(2*a);
        double root2 = (-b-c11)/(2*a);
        
        System.out.println("Root 1 is : "+root1);
        System.out.println("\nRoot 1 is : "+root2);
    }
}
