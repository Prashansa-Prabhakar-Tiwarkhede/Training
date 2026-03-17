import java.util.Scanner;

class Eighth{
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Alphabet : ");
        char char_input = obj.next().charAt(0);

        if(char_input == 'A' || char_input == 'E' || char_input == 'I' || char_input == 'O' || char_input == 'U' || char_input == 'a' || char_input == 'e' || char_input == 'i' || char_input == 'o' || char_input == 'u'  ){
        System.out.println("You entered a Vowel");
        }
        else{
        System.out.println("You entered a Consonant");
        }
    }
}