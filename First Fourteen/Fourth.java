import java.util.Scanner;
class Fourth{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char char_input = sc.next().charAt(0);

        int ascii = (int) char_input;

        System.out.println("ASCII value of " + char_input + " is: " + ascii);
    }
} 