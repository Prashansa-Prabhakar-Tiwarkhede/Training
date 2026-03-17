import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Its an uppercase character!");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Its a lowercase character!");
        }
        else{
            System.out.println("Its not an alphabet character!");
        }
    }
}