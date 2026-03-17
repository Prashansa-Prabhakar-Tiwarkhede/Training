import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println("This is a Leap year!");
        }
        else{
            System.out.println("This is not a leap year!");
        }
        sc.close();
    }
}
