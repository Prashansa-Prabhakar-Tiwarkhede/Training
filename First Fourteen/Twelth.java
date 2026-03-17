import java.util.Scanner;

public class Twelth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        String new_str = str.replace(" ", "");

        System.out.println("The string after removing whitespaces is : " + new_str);
    }
}