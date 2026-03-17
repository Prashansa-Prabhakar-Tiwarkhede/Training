import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str = sc.next();

        System.out.println("Enter the character to check occurence : ");
        char cr = sc.next().charAt(0);

        int len = str.length();

        int count = 0;

        for (int i=0; i<len; i++)
        {
            if(str.charAt(i)==cr)
            {
                count++;
            }
        }
        System.out.println("The character frequency is : "+count);

    } 
}
