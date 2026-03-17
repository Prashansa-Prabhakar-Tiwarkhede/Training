import java.util.Scanner;

class Seventh{
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = obj.nextInt();

        if (num % 2 == 0){
        System.out.println("The number is Even" );
        }
        else{
            System.out.println("The number is Odd" );
        }
    }
}